
import java.util.*;
public class linkdlst2 {
 public static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
      this.next = null;
     }
 }      
    public Node head;  //todo here head and tail is variable not a method.
    public Node tail;
    public int size =0;

    public void addFirst(int data){
        //todo if the value of head is null 
  
         if(head == null){
            Node newNode = new Node(data);
            head = newNode;
            tail = newNode;
            size++;
            return;
         }

        //todo when one or more node are present 
        // step1 creating a linklst
        Node newNode = new Node(data);
         // step2 node's next = head
         newNode.next = head; // link it stores the address of head object.
         // step 3 =>head's value changing into new newNode
          head = newNode;
          size++;
    }
    public  void addLast(int data){
        //todo if no node present initially
        if(head == null){ //you can also write here tail == null but by convention we write head 
            Node newNode = new Node(data);
            head = tail = newNode;
            size++;
            return;
        }
        //todo if node is present initially

        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        size++;
    }
public  void Print(){
        if(head == null){
            System.out.println("Linkdlist is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--> \t");
            temp = temp.next;
        }
        System.out.println();
    }
     public void addAtAnyIndex(int i, int data){
        Node temp = head;
        int ptr =0;
        Node newNode = new Node(data);
        if(i == 0){
            addFirst(data);
        }
        while( ptr < i -1  ){
            ptr++;
            temp = temp.next;
        }
                //Adding newNode
                newNode.next = temp.next;   
                temp.next = newNode;
                size++;
     }
   public static  void main(String[] args) {
    linkdlst2 ll = new linkdlst2();
    ll.Print();
    ll.addFirst(1);
    ll.Print();
    ll.addFirst(2);
    ll.Print();

    ll.addLast(3);
    ll.Print();
    ll.addLast(4);
     ll.addAtAnyIndex(0, 9 );
    ll.Print();
    System.out.println(ll.size);
   }
}
