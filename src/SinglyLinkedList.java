public class SinglyLinkedList {
    private int data = 0;
    private SinglyLinkedList next = null;

    public SinglyLinkedList() {

    }

    public SinglyLinkedList(int data) {
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SinglyLinkedList getNext() {
        return next;
    }

    public void addData(int data) {
        SinglyLinkedList temp = this;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.next = new SinglyLinkedList(data);
    }

    public void printAll() {
        SinglyLinkedList temp = this;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.getNext();
        }
    }
}
