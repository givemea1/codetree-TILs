class MaxHeap {
    constructor() {
        this.heap = [];
    }

    swap(idx1, idx2) {
        [this.heap[idx1], this.heap[idx2]] = [this.heap[idx2], this.heap[idx1]]
    }

    size() {
        return this.heap.length;
    }

    peek() {
        return this.heap[0];
    }

    push(val) {
        this.heap.push(val);

        let i = this.heap.length - 1;
        let p = Math.floor((i - 1)/2);

        while (this.heap[p] && this.heap[i] > this.heap[p]) {
            this.swap(i, p);
            i = p;
            p = Math.floor((i - 1)/2);
        }
    }

    pop() {
        if (this.heap.length === 0) return null;
        if (this.heap.length === 1) return this.heap.pop();

        let val = this.heap[0];

        this.heap[0] = this.heap.pop();

        let i = 0;
        let l = i * 2 + 1;
        let r = i * 2 + 2;

        while (this.heap[l] && this.heap[l] > this.heap[i]
        || this.heap[r] && this.heap[r] > this.heap[i]) {
            let maxIdx = l;
            if (this.heap[r] && this.heap[r] > this.heap[l]) {
                maxIdx = r;
            }

            i = maxIdx;
            l = i * 2 + 1;
            r = i * 2 + 2;
        }

        return val;
    }
}

const fs = require('fs');

const commands = fs.readFileSync(0).toString().trim().split("\n")
.slice(1).map(i => i.trim().split(" "));

let h = new MaxHeap();

commands.forEach(com => {
    switch(com[0]) {
        case "push":
            h.push(Number(com[1]));
            break;
        case "pop":
            console.log(h.pop());
            break;
        case "size":
            console.log(h.size());
            break;
        case "empty":
            console.log(h.size() === 0 ? 1 : 0);
            break;
        case "top":
            console.log(h.peek());
            break;
    }
})