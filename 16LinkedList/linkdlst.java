import java.util.*;
public class linkdlst {
   //todo Printing the no from 1 to 4 and print it;
   
   //step1 creating the node;
   class Node(){
      int no;
      Node next;
      Node(int n){
         this.no = n;
         this.next = null;
      }
   }
  
   //todo Manually writing the code for above class 
   //step2;
     Public static Node head;
    Public static Node tail; // Static means only attached to that class not and object means in this case no need to form and objectt of linkedlst funtion i.e ll here you can directly write linkdlst.head = new node(2);



  //todo Inbuilt method
    public static void InbuiltMethod(){
   LinkedList <Integer> list = new LinkedList<>();
      for(int i=1; i<= 4; i++){

         list.add(i);
      }
    System.out.println(list);
    for(int i=0; i<4; i++){
      System.out.print(list.get(i) +"\t");
    }
    }

   public static void main(String[] args) {
     InbuiltMethod();
     //todo calling the above defined method in main function
     linkdlst ll = new linkdlst();
     ll.head = new Node(1);
     ll.head.next = new Node(2);
   } 
}
