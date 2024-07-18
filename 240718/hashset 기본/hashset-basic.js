const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");
const commands = input.slice(1).map(i => i.trim().split(" "));

let s = new Set();

commands.forEach(com => {
    switch(com[0]) {
        case "find":
            console.log(s.has(Number(com[1])));
            break;
        case "add":
            s.add(Number(com[1]));
            break;
        case "remove":
            s.delete(Number(com[1]));
            break;
    }
})