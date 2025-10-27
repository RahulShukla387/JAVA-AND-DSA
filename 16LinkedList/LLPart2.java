import java.util.*;;
public class LLPart2 extends linkdlstSearch{
    class Node{

        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public  Node head;
    public  Node tail;
     
     //todo Checking whether the LL is circular or not ?
       Node detHeadforRemCycle = head;
        public boolean isCircular(){
            Node slow = head, fast = head;
            while (fast!= null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                detHeadforRemCycle = fast;
                if(slow == fast){
                    return true;
                }
            }
            return false;
        }
        //todo Removing the cycle of the LL
         public void removeCycle(){
         boolean result =   isCircular();
         
         if(result){
            //if result exist i again set slow equal to head and fast is at the same position.
             Node slow = head , prev = null; 
             //this time when slow will meet the fast that will be the meeting point of the cycle, okl
            while (slow != detHeadforRemCycle) {
                 slow = slow.next;
                 prev = detHeadforRemCycle;
                 detHeadforRemCycle =detHeadforRemCycle.next;
            }
             prev.next = null;
          }
         }
    public static void main(String[] args) {
        LLPart2 ll = new LLPart2();
        linkdlstSearch ll2 = new linkdlstSearch();
       //todo 
        ll.head = ll.new Node(4);
        LLPart2.Node temp = ll.new Node(9);
         ll.head.next = ll.new Node(6);
         ll.head.next.next = ll.new Node(7);
         ll.head.next.next.next = temp;
         //todo creating cycle
         temp.next = ll.head.next.next;
        // ll.AddFirst(5);
        // ll.AddFirst(1);
        // ll.AddFirst(2);
        // ll.AddFirst(6);
        // ll.AddFirst(7);
        // // ll2.print();
        // ll.print();
         System.out.println(" \n Checking is Circularity: " + ll.isCircular());
         ll.removeCycle();
         System.out.println(" \n Checking is Circularity: " + ll.isCircular());
    }
}
