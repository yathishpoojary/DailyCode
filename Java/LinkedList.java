 class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next =null;
    }


 }

public class LinkedList {
    Node head;

    public static void main( String []args) {
        LinkedList lst = new LinkedList();

        lst.insert(10) ;
        lst.insert(20);
        lst.printlist();
    }

    private void printlist() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
            System.out.println("null");
    }

    private void insert(int i) {
        Node newNode = new Node(i);
        if(head ==null) {
            head = newNode;
            return ;
        }

        Node current = head;
        while(current.next != null ){
            current =current.next;
        }
        current.next = newNode;
    }

}
