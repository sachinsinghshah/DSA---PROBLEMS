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

public class DoublyLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(13);
        Node node4 = new Node(2);

        // Set forward links
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Set backward links
        node2.prev = node1;
        node3.prev = node2;
        node4.prev = node3;

        // Traversing forward
        System.out.println("\nTraversing forward:");
        Node currentNode = node1;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");

        // Traversing backward
        System.out.println("\nTraversing backward:");
        currentNode = node4;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.prev;
        }
        System.out.println("null");
    }
}



