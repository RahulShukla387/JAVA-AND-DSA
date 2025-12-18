//todo avl tree is a tree in which balancing factors are -1, 0, 1;
// bf = left.height - right.height;
public class Avl {
    class Node{
        int data, ht;
        Node left, right;

        Node(int data){
            this.data = data;
            ht = 1;
        }
    }

    //calculating height
    public int height(Node root){
        if(root == null) return 0;
        return root.ht;
    }

    //LL rotating 
     public Node RR(Node root ){
        Node y = root.left;
        Node temp = y.right;
        y.right = root;
        root.left = temp;
        //updating heights 
        root.ht = 1 + Math.max(height(root.left), height(root.right));
        y.ht = 1 + Math.max(height(y.left), height(y.right));
        return y;
     }
      //RR rotating
       public Node LL(Node root ){
        Node y = root.right;
        Node temp = y.left;
        y.left = root;
        root.right = temp;
              //updating heights 
        root.ht = 1 + Math.max(height(root.left), height(root.right));
        y.ht = 1 + Math.max(height(y.left), height(y.right));
        return y;
     }

     //calc the balancing factor
     public int balancingFactor(Node root){
        if(root == null) return 0;
        return height(root.left) - height(root.right);
     }
     
      //inorder Traversal
      public void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + "\t");
        inorder(root.right);
      }

     //adding a node   
     public Node insert(Node root, int key){
        if(root == null) return new Node(key);
        else if(root.data > key ) {
                root.left = insert(root.left, key);
        }
        else if(root.data < key){
            root.right = insert(root.right, key);
        }
        else return root;
        //cal new height
        root.ht = 1 + Math.max(height(root.left), height(root.right));

        //calculating the balancing factor bf
        int bf = balancingFactor(root);
        //case 1
        if(bf > 1 && root.left.data > key ){
           return RR(root);
        }
        if(bf < -1 && root.right.data < key ){
           return LL(root);
        }
        if(bf > 1 && root.left.data < key ){
           root.left = LL(root.left);
           return RR(root);
        }
        if(bf < -1 && root.right.data > key ){
            root.right = RR(root.right);
           return LL(root);
        }
        return root;
        
     }

    public static void main(String[] args) {
        Avl a = new Avl();
        Avl.Node root = null;
         root = a.insert(root, 10);
       root = a.insert(root, 20);
       root = a.insert(root, 30);
       root = a.insert(root, 40);
       root = a.insert(root, 50);
       root = a.insert(root, 25);
        a.inorder(root);
    }
}
