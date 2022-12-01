
public class BinarySearchTree {
     private Node root;

     public void insert(int data) {
          root = insert(data, root);
     }

     private Node insert(int data, Node current) {
          if (current == null) {
               return new Node(data);
          }
          if (data < current.data) {
               current.left = insert(data, current.left);
          }
          if (data > current.data) {
               current.right = insert(data, current.right);
          }
          return current;
     }

     public void preorder() {
          preorder(root);
          System.out.println();
     }
     public void postorder() {
          postorder(root);
          System.out.println();
     }
     public void inorder() {
          inorder(root);
          System.out.println();
     }

     private void preorder(Node current) {
          if (current != null) {
               System.out.print(current.data + " ");
               preorder(current.left);
               preorder(current.right);
          }
     }

     public void postorder(Node current) {
          if (current != null) {
               postorder(current.left);
               postorder(current.right);
               System.out.print(current.data + " ");
          }
     }

     public void inorder(Node current) {
          if (current != null) {
               inorder(current.left);
               System.out.print(current.data + " ");
               inorder(current.right);
          }
     }
}

class Node {
     int data;
     Node left, right;

     public Node(int data) {
          this.data = data;
          this.left = this.right = null;
     }
}