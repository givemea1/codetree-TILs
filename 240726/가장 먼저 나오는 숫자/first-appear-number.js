const main = () => {
    const input = require('fs').readFileSync(0).toString().trim().split("\n");
    const nums = input[1].trim().split(" ").map(Number);
    const answers = input[2].trim().split(" ").map(Number);

    answers.forEach(a => {
        console.log(search(a, nums));
    })
}

const search = (val, nums) => {
    let l = 0;
    let r = nums.length - 1;
    let idx = -1;

    while (l <= r) {
        const mid = Math.floor((l + r) / 2);

        if (nums[mid] === val) idx = mid + 1;

        if (val <= nums[mid]) r = mid - 1;
        else l = mid + 1;
    }

    return idx;
}

main();