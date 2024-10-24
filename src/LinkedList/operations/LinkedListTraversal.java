package LinkedList.operations;

class Node {
    int data;
    Node Next;
    public Node(int data) {
        this.data = data;
        this.Next = null;
    }
}

public class LinkedListTraversal {
    static void traversal(Node head){
        Node currentNode = head;
        while(currentNode != null) {
            
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.Next;
        }
        System.out.print("null");
    }
    static void lowestVal(Node head){
        Node currentNode = head;
        int lowestVal = currentNode.data;
        while(currentNode != null) {
            if(currentNode.data < lowestVal){
                lowestVal = currentNode.data;
            }
            currentNode = currentNode.Next;
        }
        System.out.print("lowest value is " + lowestVal);
    }
    public static void main(String[] sss) {
        
        Node node1 = new Node(10);
        Node node2 = new Node(2);
        Node node3 = new Node(5);
        Node node4 = new Node(8);
        Node node5 = new Node(7);

        node1.Next = node2;
        node2.Next = node3;
        node3.Next = node4;
        node4.Next = node5;
        lowestVal(node1);
    }
}
