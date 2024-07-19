class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

const fs = require('fs');

const input = fs.readFileSync(0).toString().trim().split("\n");

const str = input[0].trim();
const coms = input.slice(2).map(i => i.trim().split(" "));

let cur = new Node(str);

const insertPrev = (cur, node) => {
    node.prev = cur.prev;
    node.next = cur;

    if (node.prev !== null) node.prev.next = node;
    if (node.next !== null) node.next.prev = node;
}

const insertNext = (cur, node) => {
    node.next = cur.next;
    node.prev = cur;

    if (node.next !== null) node.next.prev = node;
    if (node.prev !== null) node.prev.next = node;
}

const print = (cur) => {
    let prints = [];

    if (cur.prev === null) {
        prints.push("(Null)");
    } else prints.push(cur.prev.data);

    if (cur === null) {
        prints.push("(Null)");
    } else prints.push(cur.data);

    if (cur.next === null) {
        prints.push("(Null)");
    } else prints.push(cur.next.data);

    console.log(prints.join(" "));
}

coms.forEach(com => {
    switch(Number(com[0])) {
        case 1:
            insertPrev(cur, new Node(com[1]));
            break;
        case 2:
            insertNext(cur, new Node(com[1]));
            break;
        case 3:
            if (cur.prev) cur = cur.prev;
            break;
        case 4:
            if (cur.next) cur = cur.next;
            break;
    }
    print(cur);
})