const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");
const [n, q] = input[0].trim().split(" ").map(Number);
const points = input[1].trim().split(" ").map(Number);
const sections = input.slice(2).map(i => i.trim().split(" ").map(Number));

const BS = (points, val) => {
    let left = 0, right = points.length - 1;

    while (left <= right) {
        let mid = Math.floor((left + right) / 2);

        if (points[mid] === val) {
            return mid;
        } else if (points[mid] < val) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return left;
};

sections.forEach(s => {
    console.log(BS(points, s[1]) - BS(points, s[0]) + 1);
})