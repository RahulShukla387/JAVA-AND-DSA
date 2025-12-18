package binaryTree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Implementation2 {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
      int ind = -1;
    public Node BinaryTree(int[] values ){
        ind++;
        if( ind >= values.length || values[ind] == -1){
            return null;
        }
        Node newNode = new Node(values[ind]);
        newNode.left = BinaryTree(values);
        newNode.right = BinaryTree(values);
        return newNode;
    } 
    void print (Node root){
        System.out.print(root.data + " \t");
    }

    //todo finding diameter in 0(N);

   static class Info{
        int ht;
        int dm;
        Info(int ht, int dm){
            this.ht = ht;
            this.dm = dm;
        }
    }
  
     public Info diameter2(Node root){
        if(root == null) return new Info(0, 0);
         int h, d;
         Info infoleft = diameter2(root.left);
         Info inforight = diameter2(root.right);
           
         d = Math.max(infoleft.dm, Math.max(inforight.dm, infoleft.ht + inforight.ht + 1) );
         h = 1 + Math.max(infoleft.ht, inforight.ht);
         return new Info(h, d);
     }

  

    public void preorder(Node root){
        if(root == null) {
           return;
        }
        print(root);
        preorder(root.left);
        preorder(root.right);
        
    }
    //todo level traversing 
    
     public void levelTraverse(Node root){
      Queue<Node> q = new LinkedList<>();
      if(root == null){
       return;
      }
      q.add(root);
      q.add(null);
      while(q.isEmpty() == false){
        Node curr = q.remove();
          if(curr == null){
              if(q.isEmpty()) break;
              else {
             System.out.println();
              q.add(null);
            } 
          }
          else{
             System.out.print(curr.data + " \t" );
            if(curr.left != null)  q.add(curr.left);
            if(curr.right != null)  q.add(curr.right);

          }
      }
     }
     //todo finding the height of tree
      
     public int height(Node root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
     }
      
       //todo finding the diameter of the tree in 0(N^2)
       public int diameter (Node root){
         if(root == null) return 0;
          int lh, rh, h, ld, rd;
          lh = height(root.left);
          rh = height(root.right);
          ld = diameter(root.left);
          rd =  diameter(root.right);
          h = lh + rh + 1 ;
         return  Math.max(ld , Math.max( rd , h));
       }
  
       //todo finding subtree in a tree 

       public boolean isIdentical(Node root, Node st){
         if(root ==  null && st == null) return true;
         if(root == null || st == null || root.data != st.data) return false;
          if(!isIdentical(root.left, st.left)) return false;
          if(!isIdentical(root.right, st.right)) return false;
          return true;
       }
        
        public boolean isSubtree(Node root, Node st){
            if(root == null) return false;
            if(root.data == st.data){
             return isIdentical(root, st);
            }
           
            return isSubtree(root.left, st) || isSubtree(root.right, st);

        }

    public static void main(String[] args) {
        int[] value = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int[] value2 = {2, 4, -1, -1, 5, -1, -1 };
        Implementation2 imp = new Implementation2();
       Node root =   imp.BinaryTree(value);
       imp.ind = -1;
       Node root2 =   imp.BinaryTree(value2);
    //    System.out.println(root.right.data);
    //  imp.preorder(root);
    // imp.levelTraverse(root);
    // System.out.println("\n" + imp.height(root));
    // System.out.println("\n" + imp.diameter(root));
    // System.out.println("\n" + imp.diameter2(root).dm);
    System.out.println("\n" + imp.isSubtree(root, root2));
}
}
