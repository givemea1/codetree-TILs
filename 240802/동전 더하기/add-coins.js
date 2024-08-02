const main = () => {
    const input = require('fs').readFileSync(0).toString().trim().split("\n");

    const [n, k] = input[0].trim().split(" ").map(Number);
    const coins = input.slice(1).map(i => Number(i.trim())).reverse();

    let count = 0;
    let rest = k;

    for (let i = 0; i < n; i++) {
        count += Math.floor(rest / coins[i]);
        rest = k % coins[i];
    }

    console.log(count);
}

main();