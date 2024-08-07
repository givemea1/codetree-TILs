const main = () => {
    const input = require('fs').readFileSync(0).toString().trim().split("\n");

    const [n, s] = input[0].trim().split(" ").map(Number);
    const nums = input[1].trim().split(" ").map(Number);

    console.log(search(n, s, nums));
}

const search = (n, s, nums) => {
    let sum = 0;
    let l = 0;
    let r = 0;
    for (let i = 0; i < n; i++) {
        sum += nums[i];
        if (sum >= s) {
            r = i;
            break;
        }
    }

    if (sum < s) return -1;
    min = r - l + 1;

    while (r < n) {
        while (sum - nums[l] >= s) {
            sum -= nums[l];
            l++;
        }
        min = Math.min(min, r - l + 1);

        r++;
        sum += nums[r];
    }

    return min;
}

main();