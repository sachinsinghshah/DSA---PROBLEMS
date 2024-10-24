package LinkedList.operations;


class Node {
    int data;
    Node Next;
    public Node(int data) {
        this.data = data;
        this.Next = null;
    }
}
public class LinkedListDeletion {
    static void traversal(Node head){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data +"->");
            currentNode = currentNode.Next;
        }
        System.out.print("null");
    }
    static Node deleteNode(Node head, Node delete){
        if(head == delete){
            Node del = head.Next;
            head.Next = null;
            return del;
        }
        Node currentNode = head;
         
        while(currentNode != null){
            if(delete == currentNode.Next){
                currentNode.Next = delete.Next;
                delete.Next = null;
            }
            currentNode = currentNode.Next;
        }
        return head;
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
        traversal(node1);
        node1 = deleteNode(node1, node1);
        System.out.println("\n");
        traversal(node1);

    }
}
