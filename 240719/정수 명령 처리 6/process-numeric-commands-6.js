const Heap = require('collections/heap');
const fs = require('fs');

const commands = fs.readFileSync(0).toString().trim().split("\n")
.slice(1).map(i => i.trim().split(" "));

let h = new Heap();

commands.forEach(com => {
    switch(com[0]) {
        case "push":
            h.push(Number(com[1]));
            break;
        case "pop":
            console.log(h.pop());
            break;
        case "size":
            console.log(h.length);
            break;
        case "empty":
            console.log(h.length === 0 ? 1 : 0);
            break;
        case "top":
            console.log(h.peek());
            break;
    }
})