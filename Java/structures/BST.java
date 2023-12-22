package structures;

public class BST {

    @SuppressWarnings("unused") private int size;
    @SuppressWarnings("unused") private Node root;

    @SuppressWarnings("unused")
    public BST() {
        this.size = 0;
        this.root = null;
    }

    @SuppressWarnings("unused")
    public BST(Node fragment, int size) {
        this.size = size;
        this.root = fragment;
    }

    @Override
    @SuppressWarnings("unused")
    public String toString() {
        return root == null ? "()" : root.toString();
    }

    @SuppressWarnings("unused")
    public int size() {
        return this.size;
    }

    @SuppressWarnings("unused")
    public void addNode(int value, int key) {

        Node current = root;
        if (current == null) { root = new Node(value, key); }

        // TODO: Fix this
        while (current != null) {
            if (current.getKey() == key) {
                current.setKey(key);
                current.setValue(value);
            } else if (current.getKey() > key && current.getLeft() == null) {
                break;
            } else if (current.getKey() > key) {
                current = current.getLeft();
            } else if (current.getKey() < key && current.getRight() == null) {
                break;
            } else if (current.getKey() < key) {
                current = current.getRight();
            }
        }

        if (current.getKey() > key) {
            current.setLeft(new Node(value, key));
        } else if (current.getKey() < key) {
            current.setRight(new Node(value, key));
        }

    }

    @SuppressWarnings("unused")
    public Node removeNode(int key) {
        // TODO: Implement this
        Node current = root;
        return current;
    }

    @SuppressWarnings("unused")
    public Node getNode(int key) {

        Node current = root;
        if (current == null) { return null; }

        while (current.getKey() != key) {
            if (current.getKey() > key && current.getLeft() != null) {
                current = current.getLeft();
            } else if (current.getKey() > key) {
                return null;
            } else if (current.getKey() < key && current.getRight() != null) {
                current = current.getRight();
            } else if (current.getKey() < key) {
                return null;
            }
        }

        return current;

    }

    @SuppressWarnings("unused")
    public Node getNodeApprox(int key) {

        Node current = root;
        if (current == null) { return null; }

        while (current.getKey() != key) {
            if (current.getKey() > key && current.getLeft() != null) {
                current = current.getLeft();
            } else if (current.getKey() > key) {
                return current;
            } else if (current.getKey() < key && current.getRight() != null) {
                current = current.getRight();
            } else if (current.getKey() < key) {
                return current;
            }
        }

        return current;

    }

    @SuppressWarnings("unused")
    public int getValue(int key) {
        Node target = getNode(key);
        return target == null ? -1 : target.getValue();
    }

    @SuppressWarnings("unused")
    public int getValueApprox(int key) {
        Node target = getNodeApprox(key);
        return target == null ? -1 : target.getValue();
    }

    @SuppressWarnings("unused")
    public int compareTo(BST o) {
        return this.size() - o.size();
    }

    // TODO: Remove this
    public static void main(String[] args) {
        BST tree = new BST();
        System.out.println(tree);
        tree.addNode(3, 3);
        System.out.println(tree);
    }
}
