package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyCircularLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(13);
        Node node4 = new Node(2);

        // Set up the circular links
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;  // Circular link

        // Start traversing from node1
        Node currentNode = node1;
        Node startNode = node1;

        System.out.print(currentNode.data + " -> ");
        currentNode = currentNode.next;
        /**
         * purpose of this while loop is to identify wether contron has reached from last node to first node. 
         * it will state that the linkedlist is an circular one.
         */
        while (currentNode != startNode) { 
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println("...");
    }
}
