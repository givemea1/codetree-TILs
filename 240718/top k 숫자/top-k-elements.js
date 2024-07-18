const sortedSet = require('collections/sorted-set');
const fs = require('fs');

const input = fs.readFileSync(0).toString().trim().split("\n");
const [_, k] = input[0].trim().split(" ").map(Number);
const nums = input[1].trim().split(" ").map(Number);

const s = new sortedSet(nums);
let answer = [];

for (let i = 0; i < k; i++) {
    let g = s.findGreatest().value;
    answer.push(g);
    s.delete(g);
}

console.log(answer.join(" "));