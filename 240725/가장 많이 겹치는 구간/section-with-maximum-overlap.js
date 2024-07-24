const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

const n = Number(input[0].trim());
const sections = input.slice(1).map(i => i.trim().split(' ').map(Number));

const nums = sections.flat().sort((a, b) => a - b);
let sectionCount = Array(n * 2 - 1).fill(0); // sectionCount[i] = 구간 [nums[i], nums[i + 1]] 횟수
let max = 0;

for (let section of sections) {
    for (let i = nums.indexOf(section[0]); i < nums.indexOf(section[1]); i++) {
        max = Math.max(max, ++sectionCount[i]);
    }
}

console.log(max);