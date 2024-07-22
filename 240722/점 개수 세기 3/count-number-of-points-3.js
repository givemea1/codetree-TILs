const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");
const [n, q] = input[0].trim().split(" ").map(Number);
const points = input[1].trim().split(" ").map(Number);
const sections = input.slice(2).map(i => i.trim().split(" ").map(Number));

for (let i = 0; i < q; i++) {
    console.log(points.filter(p => p >= sections[i][0] && p <= sections[i][1]).length);
}