const input = require('fs').readFileSync(0).toString().trim();

let left = [];
let right = [];

for (let i = 0; i < input.length - 1; i++) {
    if (input.charAt(i) === "(" && input.charAt(i + 1) === "(") {
        left.push(i);
    }
    if (input.charAt(i) === ")" && input.charAt(i + 1) === ")") {
        right.push(i);
    }
}

console.log(left.reduce((prev, next) => {
    return prev + right.filter(i => i > next).length;
}, 0))