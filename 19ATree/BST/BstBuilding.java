
public class BstBuilding {
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
   //todo Building the BST also inserting the node at correct position;
   
   public Node bst(Node root, int val){
       if(root == null) {
          root = new Node(val);
          return root;
       }
       else{
        if(root.data > val){
            root.left = bst(root.left, val);
        }
        else{
            root.right = bst(root.right, val);
        }
       }
       return root;
   }
    
   //todo inorder traversal 
   
   public void inorder(Node root){
    if(root == null) return;
      inorder(root.left);
      System.out.print(root.data + "\t");
      inorder(root.right);
    
    }

    //todo Searching a key in in BST

    public boolean search(Node root, int val){
      if(root == null) return false;
      if(root.data == val) return true;
      if(root.data > val){
         return search(root.left, val);
      }
      else return search(root.right, val);
    }
    
    //todo deleting the node from BST

    public Node dlt(Node root, int val){
      if(root == null) return null;
      if(val < root.data){
        root.left = dlt(root.left, val);
      }
      else if(val > root.data){
        root.right = dlt(root.right, val);
      }
      else {
        // Now the value is equal to root.data

        //case1 No child
         if(root.left == null && root.right == null) return null;
         //case2 OneChild
         if(root.left == null) return root.right;
        else if(root.right == null) return root.left;

         //case 3 TwoChild => Inorder always will be in right of the tree so we do not need to search in the left , leftmost of the right tree.

        Node v = InOrderValue(root.right);
          root.data = v.data;
          root.right =  dlt(root.right, v.data);
          return root;
      }
        return root;

    }
    public Node InOrderValue(Node root){
      while(root.left != null){
        root = root.left;
      }
      return root;
    }
  
    //todo PrintInRange i.e if given [5, 11] print all the values in sequence which lies in the range
    
    public void PrintInRange(Node root, int ll, int ul){
      if(root == null) return;

      if( ll > root.data) {
        PrintInRange(root.right, ll, ul);
      }
     else if(root.data > ul){
        PrintInRange(root.left, ll, ul);
      }
      else {
        PrintInRange(root.left, ll, ul);
        System.out.print( root.data + "\t");
        PrintInRange(root.right, ll, ul);
      }
      }
   public static void main(String[] args) {
     Node root = null;
    BstBuilding b = new BstBuilding();
    int[] arr = {5, 4, 6, 3, 8, 1, 2 };
     for(int i =0; i< arr.length; i++){
       root = b.bst(root, arr[i]);
     }
    //  System.out.println("The inorder traversal is ");
    b.inorder(root);
    System.out.println();
    //  b.dlt(root, 4);
    //  System.out.println();
    //  b.inorder(root);
    // System.out.println(b.search(root, 1));
    b.PrintInRange(root, 3, 6);
   }
}
