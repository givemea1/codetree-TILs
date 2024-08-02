const main = () => {
    const input = Number(require('fs').readFileSync(0).toString().trim());

    let l = 1;
    let r = input;
    let max = 1;

    while (l <= r) {
        const mid = Math.floor((l + r) / 2);

        if (mid * (mid + 1) / 2 <= input) {
            l = mid + 1;
            max = Math.max(max, mid);
        } else {
            r = mid - 1;
        }
    }

    console.log(max);
}

main();