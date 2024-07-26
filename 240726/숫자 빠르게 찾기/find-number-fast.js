const main = () => {
    const input = require('fs').readFileSync(0).toString().split("\n");

    const arr = input[1].trim().split(" ").map(Number);
    const nums = input.slice(2).map(i => Number(i.trim()));

    nums.forEach(num => {
        console.log(binarySearch(num, arr));
    })
}

const binarySearch = (val, arr) => {
    let l = 0;
    let r = arr.length - 1;

    while (l <= r) {
        const mid  = Math.floor((l + r) / 2);

        if (arr[mid] === val) return mid + 1;
        
        if (val < arr[mid]) {
            r = mid - 1;
        } else {
            l = mid + 1;
        }
    }

    return -1;
}

main();