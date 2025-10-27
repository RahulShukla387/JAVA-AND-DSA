import java.util.*;;
public class PuttingNodeInStack {
     static class Node {
     int val;
     Node next;  
    Node(int val){
        this.val = val;
        this.next = null;
    }
    }
    public static Node head = null ;
    public static Node tail = null;
      
     public static class Stack {
         public static boolean isEmpty (){
          if(head == null){
            return true;
          }  
          return false;
         }
         //push => inputing the node
         public static void push(int data){
          Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }
           newNode.next = head;
           head = newNode;
           return;
         }
         
         //pop => deleting the value from the linkdlst

         public static void pop(){
          if(isEmpty()){
            System.out.println("NO list found");
          }
          Node value = head;
          head = head.next;
          System.out.println("deleted value is: " + value.val);
          return;
         }

         //peep => to seeing the value;
         public static void peep(){
           System.out.println(head.val); 
           return;
         }
         public static void print(){
           Node temp = head;
           while(temp != null){
               System.out.println(temp.val);
               temp = temp.next;
           }
           return;
         }
          
         //todo Using iterative method

        public static void pushBottom(int data){
           Node newNode = new Node(data);
           if(isEmpty()){
              newNode= head = tail;
            }
            Node temp = head;
            while(temp.next != null){
               temp = temp.next;
            }
            temp.next = newNode;
            temp  = newNode;
         }
         //todo Using recursive 
         public static void pushAtBottom(Stack<Integer> s , int data){
            //base case
            if(isEmpty()){
                s.push(data);
                return;
            }
            int val = s.pop();
            pushAtBottom(s, data);
            s.push(val);
         }
     }
   public static void main(String[] args) {
//    Stack p =  new Stack(); //stack is static
    Stack.push(4);
    Stack.push(3);
    Stack.push(5);
    Stack.push(8);
    // Stack.peep();
    // Stack.pop();
    
    // Stack.print();
    //todo It will work when you will not use self made stack class.
    // Stack <Integer> s = new Stack<>();
    // s.push(5);
    // s.push(8);
    // Stack.pushAtBottom(s, 7);
   } 
}
