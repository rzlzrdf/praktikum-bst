public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(8);
        bst.insert(3);
        bst.insert(10);
        bst.insert(14);
        bst.insert(13);
        bst.insert(1);
        bst.insert(6);
        bst.insert(4);
        bst.insert(7);

        bst.preorder();
        bst.postorder();
        bst.inorder();
    }
}
