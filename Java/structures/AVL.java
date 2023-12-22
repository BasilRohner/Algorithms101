package structures;

public class AVL extends BST {

    @SuppressWarnings("unused") private int size;
    @SuppressWarnings("unused") private Node root;

    @SuppressWarnings("unused")
    public AVL() {
        this.size = 0;
        this.root = null;
    }

    @SuppressWarnings("unused")
    public AVL(Node fragment, int size) {
        this.size = size;
        this.root = fragment;
    }

    @SuppressWarnings("unused")
    public boolean isBalanced() {
        // TODO
        return true;
    }

    @SuppressWarnings("unused")
    public void balance() {
        // TODO
        return;
    }

    @Override
    @SuppressWarnings("unused")
    public void addNode(int value, int key) {
        super.addNode(value, key);
        if (isBalanced()) {
            balance();
        }
    }

    @Override
    @SuppressWarnings("unused")
    public Node removeNode(int key) {
        Node current = super.removeNode(key);
        if (isBalanced()) {
            balance();
        } return current;
    }

}
