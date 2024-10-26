package LinkedList.operations;

class Node {
    int data;
    Node Next;
    public Node(int data) {
        this.data = data;
        this.Next = null;
    }
}

public class LinkedListInsertion{
    static void traversal(Node head){
        Node currentNode = head;
        while(currentNode != null) {
            
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.Next;
        }
        System.out.print("null");
    }

    static Node insertionNode(Node head, Node insertNode, int position){
        if (position == 1){
            insertNode.Next = head;
            return insertNode;
        }
        Node currentNode = head;
        for(int i = 0 ; i<(position-1); i++){
            if(currentNode == null){
                break;
            }
            currentNode = currentNode.Next;
        }

        if (currentNode != null) {
            insertNode.Next = currentNode.Next;
            currentNode.Next = insertNode;
        }
        return head; 
    }
    public static void main(String[] args) {
        // Initialize nodes
        Node node1 = new Node(11);
        Node node2 = new Node(12);
        Node node3 = new Node(13);
        Node node4 = new Node(14);
        Node node5 = new Node(15);
        Node node6 = new Node(16);
    
        // Link nodes
        node1.Next = node2;
        node2.Next = node3;
        node3.Next = node4;
        node4.Next = node5;
        node5.Next = node6;
    
        // Traverse and print the original linked list
        System.out.println("Original Linked List:");
        traversal(node1);
    
        // Insert a new node at position 2
        Node newNode = new Node(1000);
        node1 = insertionNode(node1, newNode, 2);
    
        // Traverse and print the linked list after insertion
        System.out.println("\nLinked List after insertion:");
        traversal(node1);
    }
}
