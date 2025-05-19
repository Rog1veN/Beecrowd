const sharp = require('sharp');
const fs = require('fs');

// Ler o arquivo original
const content = fs.readFileSync('visual_meteoros_estrelas.txt', 'utf8');

// Criar matriz por colunas
const lines = content.split('\n').filter(line => line.length > 0);
const height = lines.length;
const width = lines[0].length;

// Calcular densidade por coluna
let columnDensities = Array(width).fill(0);

for (let x = 0; x < width; x++) {
    for (let y = 0; y < height; y++) {
        if (lines[y][x] === 'o' || lines[y][x] === '.') {
            columnDensities[x]++;
        }
    }
}

// Definir threshold de densidade (exemplo: 20%)
const threshold = 0.2;
const minObjects = Math.ceil(height * threshold);

// Preparar linha Morse filtrada + matriz RGB
let filteredLine = '';
let rgbMatrix = [];

for (let y = 0; y < height; y++) {
    let row = [];
    for (let x = 0; x < width; x++) {
        if (columnDensities[x] >= minObjects) {
            if (lines[y][x] === 'o') {
                row.push([255, 0, 0]); // meteoro vermelho
            } else if (lines[y][x] === '.') {
                row.push([255, 255, 255]); // estrela branca
            } else {
                row.push([0, 0, 0]); // fundo
            }
        } else {
            row.push([0, 0, 0]); // fundo nas colunas descartadas
        }
    }
    rgbMatrix.push(row);
}

// Gerar linha Morse filtrada
for (let x = 0; x < width; x++) {
    if (columnDensities[x] >= minObjects) {
        let columnContent = '';
        for (let y = 0; y < height; y++) {
            if (lines[y][x] === 'o' || lines[y][x] === '.') {
                columnContent += lines[y][x];
            }
        }
        filteredLine += columnContent.includes('o') ? '-' : '.';
    } else {
        filteredLine += ' ';
    }
}

// Salvar linha filtrada em texto
fs.writeFileSync('linha_filtrada_morse.txt', filteredLine, 'utf8');
console.log('Linha filtrada e convertida para Morse salva em linha_filtrada_morse.txt');

// Gerar imagem PNG filtrada mantendo meteoros vermelhos
const flatRgb = Buffer.from(rgbMatrix.flat().flat());

// Criar imagem
sharp(flatRgb, {
    raw: {
        width: width,
        height: height,
        channels: 3
    }
})
    .resize(width * 10, height * 10, { kernel: "nearest" })
    .toFile('imagem_filtrada_meteoros_estrelas.png')
    .then(() => console.log('Imagem filtrada gerada em imagem_filtrada_meteoros_estrelas.png'))
    .catch(err => console.error('Erro ao gerar imagem:', err));
