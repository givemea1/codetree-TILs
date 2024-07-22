const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');

const [n, k] = input[0].trim().split(" ").map(Number);
const nums = input[1].trim().split(" ").map(Number);

let prefixSums = Array(n).fill(0);
prefixSums[0] = nums[0];

for (let i = 1; i < n; i++) {
    prefixSums[i] = prefixSums[i - 1] + nums[i];
}

let count = 0;

for (let i = 0; i < n; i++) {
    for (let j = i; j < n; j++) {
        if (i === j && nums[i] === k) count++;
        else if (i === 0 && prefixSums[j] === k) count++;
        else if (prefixSums[j] - prefixSums[i - 1] === k) count++; 
    }
}

console.log(count);