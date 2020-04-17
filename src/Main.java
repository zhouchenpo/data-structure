public class Main {
    public static void main(String[] args){
        /*测试二叉树*/
        BinaryTree testTree = new BinaryTree(1);
        testTree.addRightChild(3);
        testTree.addLeftChild(2);
        testTree.pre().printAll();
        System.out.println();
        testTree.in().printAll();
        System.out.println();
        testTree.post().printAll();
        System.out.println();
        testTree.clearAfterTraversal();

        /*测试链表*/
        SinglyLinkedList list = new SinglyLinkedList(new int[] {1,1,1,1,1,2,3,4,5,1,1,1});
        list.printAll();
        list = list.deleteAll(1);
        System.out.println();
        list.printAll();
        System.out.println();
        list = list.reverse();
        list.printAll();
        System.out.println();

        /*测试堆栈*/
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(1);
        System.out.println(stack.peek());
        stack.push(2);
        System.out.println(stack.peek());

    }
}
