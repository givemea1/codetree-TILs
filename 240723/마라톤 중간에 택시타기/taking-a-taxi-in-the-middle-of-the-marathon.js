const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n")
const n = Number(input[0].trim());
const points = input.slice(1).map(i => i.trim().split(" ").map(Number));

const getDist = (point1, point2) => {
    return Math.abs(point1[0] - point2[0]) + Math.abs(point2[1] - point1[1]);
}

let distSum = Array(n).fill(0);

for (let i = 1; i < n; i++) {
    distSum[i] = distSum[i - 1] + getDist(points[i - 1], points[i]);
}

const getJumpDist = (i) => {
    return distSum[i - 1] + distSum[n - 1] - distSum[i + 1] + getDist(points[i - 1], points[i + 1])
}

let min = distSum[n - 1];
for (let i = 1; i < n - 1; i++) {
    min = Math.min(min, getJumpDist(i));
}

console.log(min);