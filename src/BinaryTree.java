public class BinaryTree {
    private int data = 0;
    private BinaryTree leftChild = null;
    private BinaryTree rightChild = null;
    private final SinglyLinkedList preTemp = new SinglyLinkedList(-1);
    private final SinglyLinkedList inTemp = new SinglyLinkedList(-1);
    private final SinglyLinkedList postTemp = new SinglyLinkedList(-1);

    public BinaryTree(int data) {
        this.data = data;
    }

    public BinaryTree() {

    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void addLeftChild(int data) {
        this.leftChild = new BinaryTree(data);
    }

    public BinaryTree getLeftChild() {
        return this.leftChild;
    }

    public void addRightChild(int data) {
        this.rightChild = new BinaryTree(data);
    }

    public BinaryTree getRightChild() {
        return this.rightChild;
    }

    public SinglyLinkedList preOrder(BinaryTree tree) {
        preTemp.addData(tree.data);
        if (tree.leftChild != null) {
            preOrder(tree.leftChild);
        }
        if (tree.rightChild != null) {
            preOrder(tree.rightChild);
        }
        return preTemp.getNext();
    }

    public SinglyLinkedList inOrder(BinaryTree tree) {
        if (tree.leftChild != null) {
            inOrder(tree.leftChild);
        }
        inTemp.addData(tree.data);
        if (tree.rightChild != null) {
            inOrder(tree.rightChild);
        }
        return inTemp.getNext();
    }

    public SinglyLinkedList postOrder(BinaryTree tree) {
        if (tree.leftChild != null) {
            postOrder(tree.leftChild);
        }
        if (tree.rightChild != null) {
            postOrder(tree.rightChild);
        }
        postTemp.addData(tree.data);
        return postTemp.getNext();
    }

    public SinglyLinkedList pre() {
        return preOrder(this);
    }

    public SinglyLinkedList in() {
        return inOrder(this);
    }

    public SinglyLinkedList post() {
        return postOrder(this);
    }

    public void clearAfterTraversal(){
        this.preTemp.clear();
        this.inTemp.clear();
        this.preTemp.clear();
    }

}
