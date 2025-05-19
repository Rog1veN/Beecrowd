const sharp = require("sharp");

(async function () {
    try {

        //auxiliary functions
        //verify if the pixel color is white
        function isStar(pixel) {
            return pixel[0] == 255 && pixel[1] == 255 && pixel[2] == 255;
        }

        //verify if the pixel color is red
        function isMeteor(pixel) {
            return pixel[0] == 255 && pixel[1] == 0 && pixel[2] == 0;
        }

        //load image
        const image = sharp("./assets/images/meteor_challenge_01.png");
        const rgb = await image.raw().toBuffer();
        const metadata = await image.metadata();

        //initialize counters and matrix
        let starsCounter = 0;
        let meteorCounter = 0;
        let meteorOnWater = 0;
        let matrix = [];

        //read data from image
        const width = metadata.width;
        const height = metadata.height;

        //counting stars, meteors and creates a matrix
        for (let line = 0; line < height; line++) {

            let pixel = [];

            for (let column = 0; column < width; column++) {

                const index = (line * width + column) * 4;
                const r = rgb[index];
                const g = rgb[index + 1];
                const b = rgb[index + 2];
                const a = rgb[index + 3];

                pixel.push([r, g, b, a]);

                if (r == 255 && g == 255 && b == 255) {
                    starsCounter++;
                }
                if (r == 255 && g == 0 && b == 0) {
                    meteorCounter++;
                }
            }
            matrix.push(pixel);
        }

        //counting meteors that will hit the water
        for (let i = 0; i < matrix.length; i++) {
            for (let j = 0; j < matrix[i].length; j++) {

                const pixel = matrix[i][j];

                if (isMeteor(pixel)) {

                    for (let pixelLine = i; pixelLine < height; pixelLine++) {
                        const pixelDown = matrix[pixelLine][j];

                        //black - floor
                        if (pixelDown[0] == 0 && pixelDown[1] == 0 && pixelDown[2] == 0) {
                            break;
                        }

                        //red - water
                        if (pixelDown[0] == 0 && pixelDown[1] == 0 && pixelDown[2] == 255) {
                            meteorOnWater++;
                            break;
                        }
                    }
                }
            }
        }

        //counting stars and meteors from each column
        let starsPerCol = [];
        let meteorsPerCol = [];

        for (let line = 0; line < width; line++) {

            let stars = 0;
            let meteors = 0;

            for (let column = 0; column < height; column++) {
                const pixel = matrix[column][line];
                if (isStar(pixel)) {
                    stars++;
                }
                if (isMeteor(pixel)) {
                    meteors++;
                }
            }
            starsPerCol.push(stars);
            meteorsPerCol.push(meteors);
        }

        //unifies both arrays of 0 e 1
        const bitsArray = starsPerCol.concat(meteorsPerCol);
        const binaryCode = bitsArray.map(count => (count > 0 ? 1 : 0));
        let chars = [];

        //convert binary to ascii 
        for (let i = 0; i < binaryCode.length; i += 8) {
            const byteBits = binaryCode.slice(i, i + 8);

            const byteValue = parseInt(byteBits.join(""), 2);
            chars.push(String.fromCharCode(byteValue));
        }

        //treat the phrase to print
        const hiddenPhrase = chars.join("");

        //showing results
        console.log("\nStars: ", starsCounter);
        console.log("Meteors: ", meteorCounter);
        console.log("Meteors hitting the water: ", meteorOnWater);
        console.log("Hidden phrase: ", hiddenPhrase);
        console.log();

    } catch (error) {
        console.log(error);
    }

})()