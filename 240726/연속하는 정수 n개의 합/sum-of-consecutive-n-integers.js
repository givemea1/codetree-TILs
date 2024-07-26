const main = () => {
    const input = require('fs').readFileSync(0).toString().split("\n")
    const [n, m] = input[0].trim().split(" ").map(Number);
    const nums = input[1].trim().split(" ").map(Number);

    console.log(search(n, m, nums));
}

const search = (n, m, nums) => {
    let count = 0;
    let l = 0;
    let r = null;
    let sum = 0;

    for (let i = l; i < n; i++) {
        sum += nums[i];
        if (sum >= m) {
            r = i;
            break;
        }
    }

    if (sum < m) return -1;

    while (r < n) {
        while (sum - nums[l] >= m) {
            sum -= nums[l];
            l++;
        }

        if (sum === m) count++;
        r++;
        sum += nums[r];
    }

    return count;
}

main();