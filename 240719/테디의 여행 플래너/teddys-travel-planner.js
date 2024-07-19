class Node {
    constructor(data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

const connect = (s, e) => {
    if (s) s.next = e;
    if (e) e.prev = s;
}

const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");
const cities = input[1].trim().split(" ");
const coms = input.slice(2).map(i => i.split(" "));

let cur = new Node(cities[0]);

let cur2 = cur;
for (let i = 1; i < cities.length; i++) {
    connect(cur2, new Node(cities[i]));
    cur2 = cur2.next;
}
connect(cur2, cur);

const print = (cur) => {
    if (cur.prev && cur.next && (cur.prev !== cur.next)) {
        console.log(cur.prev.data + " " + cur.next.data);
    } else console.log(-1);
}

coms.forEach(com => {
    switch(Number(com[0])) {
        case 1:
            if (cur.next) cur = cur.next;
            break;
        case 2:
            if (cur.prev) cur = cur.prev;
            break;
        case 3:
            connect(cur, cur.next.next);
            break;
        case 4:
            let newNode = new Node(com[1]);
            connect(newNode, cur.next);
            connect(cur, newNode);       
    }
    print(cur);
})