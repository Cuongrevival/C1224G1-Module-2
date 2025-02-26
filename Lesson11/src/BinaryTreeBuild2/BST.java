package BinaryTreeBuild2;

public class BST<K extends Comparable<K>> {
    private TreeNode<K> root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void insert(K key) {
        if (root == null) {
            root = new TreeNode<>(key);
        } else {
            TreeNode<K> parent = null;
            TreeNode<K> current = root;
            while (current != null) {
                if (key.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (key.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    break;
                }
            }
            TreeNode<K> newNode = new TreeNode<>(key);
            if (parent == null) {
                root = newNode;
            } else {
                if (key.compareTo(parent.element) < 0) {
                    parent.left = newNode;
                } else if (key.compareTo(parent.element) > 0) {
                    parent.right = newNode;
                }
            }
            size++;
        }
    }

    public void postOrder(TreeNode<K> root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.element + " ");
        }
    }

    public static void main(String[] args) {
        BST<Integer> myTree = new BST<>();
        myTree.insert(27);
        myTree.insert(14);
        myTree.insert(35);
        myTree.insert(10);
        myTree.insert(19);
        myTree.insert(31);
        myTree.insert(42);
        myTree.postOrder(myTree.root);
        System.out.println(myTree.getSize());
    }
}
