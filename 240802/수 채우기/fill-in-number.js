const main = () => {
    const input = Number(require('fs').readFileSync(0).toString().trim());
    let answer = Math.floor(input / 5) + (input % 5) / 2
    
    console.log(input % 5 % 2 ? -1 : answer);
}

main();