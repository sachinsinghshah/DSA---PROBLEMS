package LinkedList;
 
class Node {
    int data;
    Node next;
 
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 
class LinkedList {
    Node head;
 
    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {  //[1,2,3,4]
                temp = temp.next;        // H 
            }
            temp.next = newNode;
        }
    }
 
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            System.out.print("<"+temp +">" + " -> ");
        }
        System.out.println("null");
    }
 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(3);
        list.addNode(5);
        list.addNode(13);
        list.addNode(2);
        list.addNode(16);
        list.addNode(19);
 
        list.printList();
    }
}