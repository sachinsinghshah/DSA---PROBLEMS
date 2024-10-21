package LinkedList;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class CircularDoublyLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(13);
        Node node4 = new Node(2);

        // Set up the circular doubly linked list
        node1.next = node2;
        node1.prev = node4;

        node2.prev = node1;
        node2.next = node3;

        node3.prev = node2;
        node3.next = node4;

        node4.prev = node3;
        node4.next = node1;

        // Traversing forward
        System.out.println("\nTraversing forward:");
        Node currentNode = node1;
        Node startNode = node1;

        System.out.print(currentNode.data + " -> ");
        currentNode = currentNode.next;

        while (currentNode != startNode) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("...");

        // Traversing backward
        System.out.println("\nTraversing backward:");
        currentNode = node4;
        startNode = node4;

        System.out.print(currentNode.data + " -> ");
        currentNode = currentNode.prev;

        while (currentNode != startNode) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.prev;
        }
        System.out.println("...");
    }
}