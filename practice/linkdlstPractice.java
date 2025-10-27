import java.util.*;
public class linkdlstPractice {
    public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public static  Node head;
public  static Node tail;
public  static Node prev;
public  static Node curr;

    public static void addAtLast(int data){
     if (head== null){
        Node newNode = new Node(data);
        head = tail = newNode;
        return;
     }
     Node newNode = new Node(data);
     tail.next = newNode;
      tail = newNode;
    }
    static Node track;
    public static boolean isCircular(){
        Node s = head, f = head;
        track = head;
        while (f.next !=null && f.next.next != null ) {
            s = s.next;
            f= f.next.next;
            track = f;
            if(s == f){
                return true;
            }
        }
        return false;
    }
        public static void removeCycle(){
            boolean result = isCircular();
            if(result){

                Node s = head, prev = null;
                while (s != track ) {
                    prev = track;
                    track = track.next;         
                }
               prev.next = prev.next.next;
               return;
            }
            System.out.println("There is no cyclic linkdlst");
        }
    
    
    
    public static void main(String[] args) {
        linkdlstPractice ll = new linkdlstPractice();
        ll.addAtLast(2);
        ll.addAtLast(3);
        ll.addAtLast(6);
        ll.addAtLast(5);
         ll.removeCycle();
    }


}