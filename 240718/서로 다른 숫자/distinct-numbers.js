const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

const nums = input[1].trim().split(" ").map(Number);

console.log(new Set(nums).size);