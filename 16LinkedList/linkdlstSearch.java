import java.util.*;
public class linkdlstSearch {
public class Node{
    int data;
    Node next;
    Node(int data){
       this.data = data;
       this.next = null;
   }
}
public Node head;
public Node tail;
public void AddFirst(int data){
    if(head == null){
        Node newNode = new Node(data);
        head = tail = newNode;
        return;
    }
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    System.out.println("Successfully added " + data);
}
//todo Searching by iterative method 
public int iterativeSearch(int key){
    Node temp = head;
    int i=0;
    while (temp != null) {
        
        if(temp.data == key){
           return i;
        }   
        else{
            temp = temp.next;
            i++;
        }
    }
    return -1;
}
public void print(){
    Node temp = head;
    while (temp !=null) {
        System.out.print(temp.data + "-> \t");
        temp = temp.next;
    }
    System.out.print("null");
}
//todo Searching by recursive method

public int RecursiveSearch(int key , int i, Node temp){
//   Node temp = head;
if(temp == null){
    return -1;
}
  if(temp.data == key){
    return i;
  }

   return RecursiveSearch(key, i+1 , temp.next);

}
public void RecursiveSearch1(int key){
    int i= 0;
    Node temp = head;
    int result = RecursiveSearch(key, i, temp);
    if(result == -1){
        System.out.println("Key not found");
    }
    System.out.println( RecursiveSearch(key, i, temp)  );
}
 //todo Reversing the node.
public void Reverse(){
   Node prev = null;
   Node curr = head;
   Node next;
   while (curr !=null) {
    next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
   }
    head = prev;
}
//todo Deleting from end to nth node
public void dltNthFromEnd(int n){
  //calculating the size of likdlist
  int sz= 0;
  Node temp = head;
  while (temp != null) {
     temp = temp.next;
     sz++;
  }
  int tdlt = sz -n +1;
  Node prev =  head;
  int i =1;
  while (i < tdlt -1){
    prev = prev.next;
    i++;
  }
   prev.next = prev.next.next;
   return;
}

//todo Finding mid of the linkdlst by slow-fast method 
  public Node midSF(){
    Node slow = head, fast = head;
    // Node  fast = head;
    // int slow = 1;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
     return slow;
  }
 //todo Finding whether it is pallindrome or not 

  public boolean isPallindrome(){
    if(head == null || head.next == null){
        return true;
    }
    // finding mid
      Node mid =   midSF();
    // reversing 2nd half  using 3 variable 4 step
        Node prev = null , curr = mid, next;
          while (curr != null) {
              next = curr.next;
              curr.next = prev;
              prev = curr;
              curr = next;
          }  
        
    //comparing left and write 
     Node left = head, right = prev ;  // prev become right half head. and for left half head is head.
      while (right != null) {
        if(left.data != right.data){
            return false;
        }
        // updating left and right;
        left = left.next;
        right = right.next;
      }
        return true;
  }
public static void main(String[] args) {
    linkdlstSearch ll = new linkdlstSearch();
    ll.AddFirst(1); 
    ll.AddFirst(2); 
    ll.AddFirst(2); 
    ll.AddFirst(2); 
    ll.AddFirst(1); 
    // ll.AddFirst(1); 


// System.out.println( "The searched element is in " + ll.iterativeSearch(3) );
System.out.println( " \n The searched element is in ");
 ll.RecursiveSearch1(3);
System.out.println(" \n linked list element: ");
ll.print();
 System.out.println("\n"+ ll.isPallindrome());
// ll.Reverse();
// System.out.println("\n Reversed element is : ");
// ll.print();
// ll.dltNthFromEnd(4);
// System.out.println(" \n After deltn element is : ");
// ll.print();
}
}
