class NodeTest {
    int dataVal ;
    NodeTest next ;

    NodeTest(int dataVal) {
        this.next = null;
        this.dataVal = dataVal;
    }

}
public class SinglyLinkedListPractice {
    NodeTest head;
    public static void main(String[] args) {

        SinglyLinkedListPractice listPractice = new SinglyLinkedListPractice();
        listPractice.insert(120);
        listPractice.insert(240);
        listPractice.insert(320);

        listPractice.printval();
    }

    private void printval() {
        NodeTest current = head;
        while(current != null) {
            System.out.println(current.dataVal);
            current = current.next;
        }
        System.out.println("null");
    }

    private void insert(int i) {
        NodeTest node = new NodeTest(i);

        NodeTest current = head;
        if(head ==null) {
            head = node;
            return;
        }

        while(current.next  != null) {
            current = current.next;

        }
        current.next = node;
    }
}


