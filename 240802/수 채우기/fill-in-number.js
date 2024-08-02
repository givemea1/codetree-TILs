const main = () => {
    const input = Number(require('fs').readFileSync(0).toString().trim());
    console.log(getCount(input));
}

const getCount = (val) => {
    let s5 = Math.floor(val / 5);
    let rest = val % 5;

    if ((val % 5) % 2) {
        if (s5 === 0) return -1;
        return s5 - 1 + (rest + 5) / 2;
    }
    return s5 + rest % 2;
}

main();