class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DLL {
    constructor(str) {
        let node = new Node(str);
        this.cur = node;
        this.size = 1;
    }

    addFront(node) {
        if (this.cur.prev === null) {
            node.next = this.cur;
            this.cur.prev = node;
        } else {
            node.prev = this.cur.prev;
            this.cur.prev.next = node;
            node.next = this.cur;
            this.cur.prev = node;
        }
    }

    addBack(node) {
        if (this.cur.next === null) {
            node.prev = this.cur;
            this.cur.next = node;
        } else {
            node.next = this.cur.next;
            node.prev = this.cur;
            this.cur.next.prev = node;
            this.cur.next = node;
        }
    }

    moveFront() {
        if (this.cur.prev) this.cur = this.cur.prev;
    }

    moveBack() {
        if (this.cur.next) this.cur = this.cur.next;
    }

    print() {
        let prints = [];

        if (this.cur.prev === null) {
            prints.push("(Null)");
        } else prints.push(this.cur.prev.data);

        if (this.cur === null) {
            prints.push("(Null)");
        } else prints.push(this.cur.data);

        if (this.cur.next === null) {
            prints.push("(Null)");
        } else prints.push(this.cur.next.data);

        console.log(prints.join(" "));
    }
}

const fs = require('fs');

const input = fs.readFileSync(0).toString().trim().split("\n");

const str = input[0].trim();
const coms = input.slice(2).map(i => i.trim().split(" "));

let dll = new DLL(str);

coms.forEach(com => {
    switch(Number(com[0])) {
        case 1:
            dll.addFront(new Node(com[1]));
            break;
        case 2:
            dll.addBack(new Node(com[1]));
            break;
        case 3:
            dll.moveFront();
            break;
        case 4:
            dll.moveBack();
            break;
    }
    dll.print();
})