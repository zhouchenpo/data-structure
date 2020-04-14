import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList myList = new SinglyLinkedList(new int[]{1, 2, 3, 4});
        myList.printAll();
        System.out.println();
        myList.addData(new int[]{5, 6, 7, 8});
        myList.printAll();

    }
}
