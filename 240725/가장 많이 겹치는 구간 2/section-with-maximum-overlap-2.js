const input = require('fs').readFileSync(0).toString().trim().split("\n");
const n = Number(input[0].trim());
const sections = input.slice(1).map(i => i.trim().split(" ").map(Number));

const nums = sections.flat().sort((a, b) => a - b);

let count = Array(nums.length).fill(0);
let max = 0;

sections.forEach(sec => {
    for (let i = nums.indexOf(sec[0]); i <= nums.indexOf(sec[1]); i++) {
        max = Math.max(max, ++count[i]);
    }
})

console.log(max);