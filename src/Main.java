
public class Main {
    public static void main(String[] args){
        BinaryTree testTree = new BinaryTree(1);
        testTree.addRightChild(3);
        testTree.addLeftChild(2);
        testTree.pre().printAll();
        System.out.println();
        testTree.in().printAll();
        System.out.println();
        testTree.post().printAll();
        testTree.clearAfterTraversal();

    }
}
