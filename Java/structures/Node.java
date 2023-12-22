package structures;

public class Node {

    private Node left;
    private Node right;
    private int value;
    private int key;

    public Node() {
        this.left = null;
        this.right = null;
        this.value = 0;
        this.key = 0;
    }

    public Node(int value, int key) {
        this.left = null;
        this.right = null;
        this.value = value;
        this.key = key;
    }

    public Node(int value, int key, Node left, Node right) {
        this.left = left;
        this.right = right;
        this.value = value;
        this.key = key;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }

    public int getValue() {
        return this.value;
    }

    public int getKey() {
        return this.key;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        String back = "("+getKey()+" ,"+getValue()+")";
        if (getLeft() != null) {
            back = getLeft().toString()+back;
        } if (getRight() != null) {
            back = back+getRight().toString();
        } return back;
    }

    @SuppressWarnings("unused")
    public int compareTo(Node o) {
        return this.getKey() - o.getKey();
    }
}
