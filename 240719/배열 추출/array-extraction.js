class MaxHeap {
    constructor() {
        this.heap = [];
    }

    swap(idx1, idx2) {
        [this.heap[idx1], this.heap[idx2]] = [this.heap[idx2], this.heap[idx1]]
    }

    push(val) {
        this.heap.push(val);

        let i = this.heap.length - 1;
        let p = Math.floor((i - 1) / 2);

        while (this.heap[p] && this.heap[i] > this.heap[p]) {
            this.swap(i, p);
            i = p;
            p = Math.floor((i - 1) / 2);
        }
    }

    pop() {
        if (this.heap.length === 0) return 0;
        if (this.heap.length === 1) return this.heap.pop();

        let val = this.heap[0];

        this.heap[0] = this.heap.pop();

        let i = 0;
        let l = 2 * i + 1;
        let r = 2 * i + 2;

        while (this.heap[l] && this.heap[l] > this.heap[i]
        || this.heap[r] && this.heap[r] > this.heap[i]) {
            let maxIdx = l;
            if (this.heap[r] && this.heap[r] > this.heap[l]) {
                maxIdx = r;
            }

            this.swap(maxIdx, i);
            i = maxIdx;
            l = 2 * i + 1;
            r = 2 * i + 2;
        }

        return val;
    }
}

const fs = require('fs');
const coms = fs.readFileSync(0).toString().trim().split("\n")
.slice(1).map(i => Number(i.trim()));

let h = new MaxHeap();

coms.forEach(com => {
    if (com === 0) {
        console.log(h.pop());
    } else {
        h.push(com);
    }
})