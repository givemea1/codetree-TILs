const input = require('fs').readFileSync(0).toString().trim().split("\n");

const [n, s] = input[0].trim().split(" ").map(Number);
const nums = input[1].trim().split(" ").map(Number);

let min = n;

for (let i = 0; i < n; i++) {
    let sum = 0;
    for (let j = i; j < i + min; j++) {
        sum += nums[j];
        if (sum >= s) {
            min = Math.min(min, j - i + 1);
            break;
        }
    }
}

console.log(min);