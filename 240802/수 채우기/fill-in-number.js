const main = () => {
    const input = Number(require('fs').readFileSync(0).toString().trim());
    
    console.log(Math.floor(input / 5) + (input % 5) / 2);
}

main();