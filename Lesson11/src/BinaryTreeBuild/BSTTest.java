package BinaryTreeBuild;

public class BSTTest {
    public static void main(String[] args) {
        BST<String> bst = new BST<>();
        bst.insert("George");
        bst.insert("Michael");
        bst.insert("Tom");
        bst.insert("Adam");
        bst.insert("Jones");
        bst.insert("Peter");
        bst.insert("Daniel");
        System.out.println("Inorder (sorted): ");
        bst.inorder();
        System.out.println(bst.getSize());
    }
}
