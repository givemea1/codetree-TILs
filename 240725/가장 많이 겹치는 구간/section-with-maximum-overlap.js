const input = require('fs').readFileSync(0).toString().trim().split("\n");

const n = Number(input[0].trim());
const sections = input.slice(1).map(i => i.trim().split(' ').map(Number));

// Step 1: Coordinate Compression
const coords = Array.from(new Set(sections.flat())).sort((a, b) => a - b);
const coordMap = new Map();
coords.forEach((val, idx) => coordMap.set(val, idx));

// Step 2: Difference Array
let diff = Array(coords.length).fill(0);

for (let [start, end] of sections) {
    diff[coordMap.get(start)] += 1;
    diff[coordMap.get(end)] -= 1;
}

// Step 3: Compute the prefix sum to find the maximum overlap
let maxOverlap = 0;
let currentOverlap = 0;

for (let val of diff) {
    currentOverlap += val;
    if (currentOverlap > maxOverlap) {
        maxOverlap = currentOverlap;
    }
}

console.log(maxOverlap);