/** 
   This class implements a binary search tree whose
   nodes hold objects that implement the Comparable
   interface.
*/
package Lab6;

import java.sql.SQLOutput;
import java.util.Deque;
import java.util.LinkedList;

public class BinarySearchTree<E extends Comparable<E>> {

   private Node root;

   private class Node {
      public E data;
      public Node left;
      public Node right;
   }

   public BinarySearchTree() {
      root = null;
   }

   public void insert(E e) {
      Node newNode = new Node();
      newNode.data = e;
      newNode.left = null;
      newNode.right = null;
      if (root == null)
         root = newNode;
      else
         insertSub(root, newNode);
   }

   private void insertSub(Node node, Node newNode) {
      int result = node.data.compareTo(newNode.data);
      if (result >= 0) {
         //go left
         if (node.left == null) {
            node.left = newNode;
         } else {
            insertSub(node.left, newNode);
         }
      } else {
         //go right
         if (node.right == null) {
            node.right = newNode;
         } else {
            insertSub(node.right, newNode);
         }
      }
   }


   public void print() {
      if (root != null)
         printSub(root);
   }

   private void printSub(Node node) {
      if (node != null) {
         printSub(node.left);
         System.out.println(node.data);
         printSub(node.right);
      }
   }

   public void nonRecursivePreorderTraversal()
   {
      Deque<Node> stack = new LinkedList();

      stack.push(root);

      while(!stack.isEmpty())
      {
         Node node = stack.pop();
         System.out.println(node);

         stack.push(node.right);
         stack.push(node.left);
      }
   }

}