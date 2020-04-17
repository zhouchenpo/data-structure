public class SinglyLinkedList {
    private int data = 0;
    private SinglyLinkedList next = null;

    public SinglyLinkedList() {
    }

    public SinglyLinkedList(int data) {
        this.data = data;
    }

    public SinglyLinkedList(int[] nums) {
        SinglyLinkedList temp = this;
        if (nums.length >= 1) {
            temp.data = nums[0];
            for (int i = 1; i < nums.length; i++) {
                temp.next = new SinglyLinkedList(nums[i]);
                temp = temp.next;
            }
        }
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public SinglyLinkedList getNext() {
        return next;
    }

    public void addData(int data) {

        SinglyLinkedList temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new SinglyLinkedList(data);
    }

    public void addData(int[] nums) {
        SinglyLinkedList temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        if (nums.length >= 1) {
            for (int num : nums) {
                temp.next = new SinglyLinkedList(num);
                temp = temp.next;
            }
        }
    }

    public void addDataAtBeginning(int data) {
        this.next = new SinglyLinkedList(data);
    }

    public void printAll() {
        SinglyLinkedList temp = this;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    public SinglyLinkedList reverse() {
        SinglyLinkedList pre = null;
        SinglyLinkedList curr = this;
        while (curr != null) {
            SinglyLinkedList next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public SinglyLinkedList deleteAll(int data) {

        SinglyLinkedList temp = new SinglyLinkedList(-1);
        temp.next = this;
        SinglyLinkedList head = temp;
        while (temp.next != null) {
            if (temp.next.data == data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head.next;

    }

    public void clear() {
        this.next = null;
    }
}
