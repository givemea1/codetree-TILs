const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");
const [n, q] = input[0].trim().split(" ").map(Number);
const points = input[1].trim().split(" ").map(Number);
const sections = input.slice(2).map(i => i.trim().split(" ").map(Number));

let map = new Map();
points.forEach((val, idx) => {
    map.set(val, idx + 1);
})

sections.forEach(s => {
    console.log(map.get(s[1]) - map.get(s[0]) + 1);
})