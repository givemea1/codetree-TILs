const sortedSet = require("collections/sorted-set");
const fs = require('fs');

const commands = fs.readFileSync(0).toString().trim().split("\n")
.slice(1).map(i => i.trim().split(" "));

let ss = new sortedSet();

commands.forEach(com => {
    switch(com[0]){
        case "add":
            ss.add(Number(com[1]));
            break;
        case "remove":
            ss.delete(Number(com[1]));
            break;
        case "find":
            console.log(ss.has(Number(com[1])));
            break;
        case "lower_bound":
            if (ss.findLeastGreaterThanOrEqual(Number(com[1])))
                console.log(ss.findLeastGreaterThanOrEqual(Number(com[1])).value)
            else console.log("None");
            break;
        case "upper_bound":
            if (ss.findLeastGreaterThan(Number(com[1])))
                console.log(ss.findLeastGreaterThan(Number(com[1])).value)
            else console.log("None");
            break;
        case "smallest":
            if (ss.size > 0) console.log(ss.findLeast().value);
            else console.log("None");
            break;
        case "largest":
            if (ss.size > 0) console.log(ss.findGreatest().value);
            else console.log("None");
            break;
    }
})