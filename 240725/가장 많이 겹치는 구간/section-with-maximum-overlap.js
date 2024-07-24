const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

const n = Number(input[0].trim());
const sections = input.slice(1).map(i => i.trim().split(' ').map(Number));

const nums = sections.flat().sort((a, b) => a - b);
let sectionCount = Array(nums.length - 1).fill(0); // sectionCount[i] = 구간 [nums[i], nums[i + 1]] 횟수
let max = 0;

for (let section of sections) {
    let s = section[0];
    let e = section[1];

    for (let i = nums.indexOf(s); i < nums.indexOf(e); i++) {
        max = Math.max(max, ++sectionCount[i]);
    }
}

let count = 0;
let prev = 0;
for (let c of sectionCount) {
    if (c === max && prev !== c) count++;
    prev = c;
}

console.log(count);