package LinkedList;

    // class Node {
    //     int data;
    //     Node next;
    
    //     public Node(int data) {
    //         this.data = data;
    //         this.next = null;
    //     }
    // }
    
    public class SinglyLinkedList {
        public static void main(String[] args) {
            Node node1 = new Node(3);
            Node node2 = new Node(5);
            Node node3 = new Node(13);
            Node node4 = new Node(2);
    
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
    
            Node currentNode = node1;
            while (currentNode != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
            System.out.println("null");
        }
    }
