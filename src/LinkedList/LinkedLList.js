class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
    }

    // Add node to the end of the list
    add(data) {
        const newNode = new Node(data);

        if (!this.head) {
            this.head = newNode;
        } else {
            let current = this.head;
            while (current.next) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Print all nodes in the list
    print() {
        let current = this.head;
        const elements = [];
        
        while (current) {
            elements.push(current.data);
            current = current.next;
            console.log(current);
            
        }
        
        console.log(elements.join(" -> ") + " -> null");
    }
}

// Example usage:
const list = new LinkedList();
list.add(3);
list.add(5);
list.add(13);
list.add(2);
list.add(16);
list.add(19);

list.print();  // Output: 3 -> 5 -> 13 -> 2 -> 16 -> 19 -> null