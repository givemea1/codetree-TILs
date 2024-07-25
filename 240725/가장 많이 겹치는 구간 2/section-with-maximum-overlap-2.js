const input = require('fs').readFileSync(0).toString().trim().split("\n");
const n = Number(input[0].trim());
const sections = input.slice(1).map(i => i.trim().split(" ").map(Number));

const nums = sections.flat().sort((a, b) => a - b);
let map = new Map();
nums.forEach((num, idx) => {
    map.set(num, idx);
})

let diff = Array(n * 2).fill(0);
sections.forEach(s => {
    diff[map.get(s[0])]++;
    diff[map.get(s[1])]--;
})

let max = 0;
let cur = 0;

for (let d of diff) {
    cur += d;
    max = Math.max(max, cur);
}

console.log(max);