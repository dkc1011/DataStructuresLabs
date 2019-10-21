package Lab6;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();

        BST.insert("Jan");
        BST.insert("Feb");
        BST.insert("Apr");
        BST.insert("Mar");
        BST.insert("Jun");
        BST.insert("May");

        BST.nonRecursivePreorderTraversal();
    }
}
