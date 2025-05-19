const sharp = require('sharp');
const fs = require('fs');

(async function () {
    try {
        const image = sharp("C:/Users/igorp/Desktop/ADS geral/desenvolvimento/Beecrowd/meteor/meteor_challenge_01.png");
        const rgb = await image.raw().toBuffer();
        const metadata = await image.metadata();

        const width = metadata.width;
        const height = metadata.height;

        // Preparar matriz com estrelas e meteoros
        let matrix = [];

        for (let y = 0; y < height; y++) {
            let row = [];
            for (let x = 0; x < width; x++) {
                const index = (y * width + x) * 4;
                const r = rgb[index];
                const g = rgb[index + 1];
                const b = rgb[index + 2];
                if (r === 255 && g === 255 && b === 255) {
                    row.push('.');
                } else if (r === 255 && g === 0 && b === 0) {
                    row.push('o');
                } else {
                    row.push(' ');
                }
            }
            matrix.push(row);
        }

        // Empilhar objetos por coluna
        let columnObjects = Array(width).fill(null).map(() => []);

        for (let x = 0; x < width; x++) {
            for (let y = 0; y < height; y++) {
                const pixel = matrix[y][x];
                if (pixel === '.' || pixel === 'o') {
                    columnObjects[x].push(pixel);
                }
            }
        }

        // Descobrir a altura máxima necessária
        const maxHeight = Math.max(...columnObjects.map(col => col.length));

        // Criar nova matriz empilhada no topo
        let stackedMatrix = Array(maxHeight).fill(null).map(() => Array(width).fill(' '));

        for (let x = 0; x < width; x++) {
            const objects = columnObjects[x];
            for (let y = 0; y < objects.length; y++) {
                stackedMatrix[y][x] = objects[y];
            }
        }

        // Criar visualização em ASCII
        const visualText = stackedMatrix.map(row => row.join('')).join('\n');
        fs.writeFileSync("visual_meteoros_estrelas.txt", visualText, 'utf8');
        console.log("Visualização ASCII salva em 'visual_meteoros_estrelas.txt'");

        // Gerar imagem (1 canal, preto e branco)
        const imgData = Buffer.from(
            stackedMatrix.flat().map(c => (c === '.' || c === 'o') ? 255 : 0)
        );

        sharp(imgData, {
            raw: {
                width: width,
                height: maxHeight,
                channels: 1
            }
        })
            .resize(width * 10, maxHeight * 10, { kernel: "nearest" }) // zoom 10x sem blur
            .toFile("visual_meteoros_estrelas.png")
            .then(() => console.log("Imagem gerada: visual_meteoros_estrelas.png"))
            .catch(err => console.error("Erro ao gerar imagem:", err));

    } catch (error) {
        console.error(error);
    }
})();