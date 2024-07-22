const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");
const [n, q] = input[0].trim().split(" ").map(Number);
const points = input[1].trim().split(" ").map(Number);
const sections = input.slice(2).map(i => i.trim().split(" ").map(Number));

const BS = (points, val) => {
    let i = Math.floor(points.length / 2);

    while (true) {
        if (points[i] === val) break;
        if (val < points[i]) i = Math.floor(i / 2);
        else i += Math.ceil(i / 2);
    }

    return i;
}

sections.forEach(s => {
    console.log(BS(points, s[1]) - BS(points, s[0]) + 1);
})