const input = require('fs').readFileSync(0).toString().trim();

let leftCount = 0;
let count = 0;

for (let i = 0; i < input.length - 1; i++) {
    if (input.charAt(i) === "(" && input.charAt(i + 1) === "(") {
        leftCount++;
    }
    if (input.charAt(i) === ")" && input.charAt(i + 1) === ")") {
        count += leftCount;
    }
}

console.log(count);