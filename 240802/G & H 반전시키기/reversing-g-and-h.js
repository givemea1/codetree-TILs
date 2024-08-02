const input = require('fs').readFileSync(0).toString().trim().split("\n");

const n = Number(input[0].trim());
const before = input[1].trim().split("");
const after = input[2].trim().split("");

let prev = before[0] === after[0];
let count = prev ? 0 : 1;

for (let i = 1; i < n; i++) {
    if (prev === true && after[i] !== before[i]) count++;
    prev = after[i] === before[i];
}

console.log(count);