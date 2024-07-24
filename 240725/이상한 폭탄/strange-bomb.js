const input = require('fs').readFileSync(0).toString().trim().split("\n");

const [n, k] = input[0].split(" ").map(Number);
const bombs = input.slice(1).map(i => Number(i.trim()));

let map = new Map();
let max = 0;

for (let i = 0; i < n; i++) {
    if (i <= map.get(bombs[i])) max = Math.max(max, bombs[i]);
    map.set(bombs[i], i + k);
}

console.log(max);