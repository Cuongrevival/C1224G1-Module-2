package DeleteNodeInTree;

import java.util.Stack;

public class BST<K extends Comparable<K>> {
    private TreeNode<K> root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(K key) {
        if (root == null) {
            root = new TreeNode<>(key);
        } else {
            TreeNode<K> current = root;
            TreeNode<K> parent = null;
            while (current != null) {
                if (key.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (key.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;

                }
            }
            TreeNode<K> newNode = new TreeNode<>(key);
            if (key.compareTo(parent.element) < 0) {
                parent.left = newNode;
            } else if (key.compareTo(parent.element) > 0) {
                parent.right = newNode;
            }
        }
        size++;
    }

    public void delete(K key) {
        if (root == null) {
            return;
        }
        root = deleteRec(root, key);
    }

    private TreeNode<K> deleteRec(TreeNode<K> root, K key) {
        if (root == null) {
            return null;
        }

        // Tìm node cần xóa
        if (key.compareTo(root.element) < 0) {
            root.left = deleteRec(root.left, key);
        } else if (key.compareTo(root.element) > 0) {
            root.right = deleteRec(root.right, key);
        } else {
            // Trường hợp 1: Node không có con hoặc chỉ có một con
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Trường hợp 2: Node có hai con, tìm node nhỏ nhất ở cây con phải
            root.element = findMin(root.right);
            root.right = deleteRec(root.right, root.element);
        }
        return root;
    }

    private K findMin(TreeNode<K> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.element;
    }

    public void preOrder(TreeNode<K> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.element + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void preOrder() {
        preOrder(root);
    }

    public boolean search(K key) {

        TreeNode<K> current = root;
        while (current != null) {
            if (key.compareTo(current.element) < 0) {
                current = current.left;
            } else if (key.compareTo(current.element) > 0) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BST<Integer> myBST = new BST<>();
        myBST.insert(27);
        myBST.insert(14);
        myBST.insert(10);
        myBST.insert(19);
        myBST.insert(35);
        myBST.insert(31);
        myBST.insert(42);
        myBST.preOrder();
        myBST.delete(10);
        myBST.preOrder();
        System.out.println(myBST.search(12));

    }
}
