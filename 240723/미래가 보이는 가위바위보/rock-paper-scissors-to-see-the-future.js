const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");
const n = Number(input[0].trim());
const arr = input.slice(1).map(i => i.trim());

let prefixSum = Array.from(Array(n), () => Array(3).fill(0)); //[H, S, P]

const setCount = (i) => {
    switch(arr[i]) {
        case "H":
            prefixSum[i][0]++;
            break;
        case "S":
            prefixSum[i][1]++;
            break;
        case "P":
            prefixSum[i][2]++;
            break;
    }
}

const setPrefixSum = () => {
    setCount(0);

    for (let i = 1; i < n; i++) {
        prefixSum[i] = prefixSum[i - 1].slice();
        setCount(i);
    }
}

setPrefixSum();

let max = 0;
for (let i = 1; i < n - 1; i++) {
    max = Math.max(
        max,
        Math.max(...prefixSum[i])
        + Math.max(prefixSum[n - 1][0] - prefixSum[i][0],
        prefixSum[n - 1][1] - prefixSum[i][1],prefixSum[n - 1][2] - prefixSum[i][2])
        );
}
console.log(max);