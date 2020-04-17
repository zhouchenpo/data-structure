public class Stack {
    private final SinglyLinkedList head = new SinglyLinkedList(-1);

    public Stack() {

    }

    public boolean isEmpty() {
        if (head.getNext() == null) {
            return true;
        } else {
            return false;
        }
    }

    public int peek() {
        return head.getNext().getData();
    }

    public void push(int data) {
        head.addDataAtBeginning(data);
    }

}
