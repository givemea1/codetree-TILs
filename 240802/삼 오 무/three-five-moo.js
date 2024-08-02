const main = () => {
    const input = Number(require('fs').readFileSync(0).toString().trim());

    const getOrder = (val) => {
        return val - Math.floor(val / 3) - Math.floor(val / 5) + Math.floor(val / 15);
    }

    let l = 1;
    let r = input * 2;
    let answer = r;

    while (l <= r) {
        let mid = Math.floor((l + r) / 2);

        if (getOrder(mid) >= input) {
            answer = Math.min(answer, mid);
            r = mid - 1;
        } else {
            l = mid + 1;
        }
    }

    console.log(answer);
}

main();