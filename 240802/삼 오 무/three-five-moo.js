const main = () => {
    const input = Number(require('fs').readFileSync(0).toString().trim());

    const getOrder = (val) => {
        if (val % 3 === 0 || val % 5 === 0) return null;
        return val - Math.floor(val / 3) - Math.floor(val / 5) + Math.floor(val / 15);
    }

    let l = 1;
    let r = input * 2;

    while (l <= r) {
        let mid = Math.floor((l + r) / 2);
        if (mid % 3 === 0 || mid % 5 === 0) mid++;

        if (getOrder(mid) === input) {
            l = mid;
            break;
        } else if (getOrder(mid) > input) {
            r = mid - 1;
        } else {
            l = mid + 1;
        }
    }

    console.log(l);
}

main();