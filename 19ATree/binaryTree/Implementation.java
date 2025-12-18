package binaryTree;
import java.util.*;
public class Implementation {
   static int sz =0;
  static int v =0;
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //todo Preorder reversal

    public static void display(Node root){
        // int sz =0; 
        if(root == null){  
    //   System.out.println("size of the tree is " + sz);
        return;
     } 
     System.out.print(root.data + "->" );
      if(root.left != null){
          System.out.print(root.left.data + ",");
      }
      if(root.right != null){
          System.out.println(root.right.data);

      }
      System.out.println();
      display(root.left);
      display(root.right);
    }
    
     //todo Preorder Traversal 
     public static void trav(Node root){
        if(root == null){
            return;
        }
        else {
            System.out.println(root.data);
            sz++;

        }
        trav(root.left);
        trav(root.right);
     }
     //todo  Traversal  in order left then root and then right i.e Inorder
     public static void travOrder(Node root){
        if(root == null){
            return;
        }
        travOrder(root.left);
        System.out.println("\n" + root.data  );
        travOrder(root.right);
     }

     //todo Traversal  in order right then root and then left i.e Postorder
     public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.right);
        System.out.println("\n" + root.data  );
        postOrder(root.left);
     }
    
     //todo level traverse first the root then other


public static void levelOrder(Node root) {
    if (root == null) return;

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        Node current = queue.poll();
        System.out.print(current.data + " ");

        if (current.left != null) queue.add(current.left);
        if (current.right != null) queue.add(current.right);
    }
}
//todo finding the size of the tree 
static int size(Node root){
    if(root == null) return 0;
    return 1 + size(root.left)  + size(root.right);
}
 //todo sum 
static int sum(Node root){
    if (root == null) return 0;
    return root.data + sum(root.left)  + sum(root.right);
}
//todo max when v is global
static void max(Node root){
    if (root == null) return;
      if(v < root.data) v = root.data;
        max(root.left);
        max(root.right);
}
//todo max when sum max is local
static int max2(Node root, int v){
    if (root == null) return v;
      if(v < root.data) v = root.data;
       v = max2(root.left, v);
       v = max2(root.right, v);
        return v;
}

    public static void main(String[] args) {
      Node root = new Node(1);
      Node n1 = new Node(2);
      Node n2 = new Node(3);    
        root.left = n1; 
        root.right = n2;
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        n1.left = n3;
        n1.right = n4;
        Node n5 = new Node(6);
        Node n6 = new Node(7);
        n2.left = n5;
        n2.right = n6;
        // System.out.println(n2.left.data);
        // display(root);
       trav(root);
       System.out.println("Inorder is \n ");
       travOrder( root );
       System.out.println("PostOrder is \n ");
       postOrder(root);
       System.out.println(" \n The size of tree is " + sz);
       System.out.println( "Size of the root is:  " +  size(root) );
       System.out.println( "sum of the root is:  " +  sum(root) );
       System.out.println( "max is :  " +  max2(root, 0) );
        max(root);
       System.out.println( "max in the tree is:  " + v );
             
    }
}
