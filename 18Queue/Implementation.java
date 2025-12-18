import java.util.*;

import binaryTree.Implementation;
public class Implementation {
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Implementation (int n){
            arr = new int[n];
            rear = -1;
            front =-1;
            size =n;
        }

    //     //todo Using array

     public static boolean isEmpty(){
       return rear == -1;
     }
    //  public static void add(int n){
    //    if(rear == size-1){
    //     System.out.println("Queue is full");
    //     return;
    // }
    // rear += 1;
    // arr[rear] = n;
    //  }
    //  public static void peek(){
    //  if(isEmpty()){
    //     System.out.println("Queue is empty");
    //  }
    // int front = arr[0];
    //   System.out.println(front);
    //  }
    //  public static void dlt(){
    //    if(isEmpty()) {
    //   System.out.println("Queue is already empty");
    //   return;
    //    } 
    //    int front = arr[0];
    //    for (int i = 0; i< rear; i++){
    //     arr[i] = arr[i+1];
    // }
    // rear--;
    //  }
     //todo Using circular array;
     public static boolean isFull(){
      return (rear +1) % size == front;
     }
     public static void addCircular(int n){
      if(isFull()) {
        System.out.println("Queue is full");
        return;
      }
      if(isEmpty()) {
       rear = (rear+1)% size;
       front = (front+1)% size;
       arr[rear] = n;
       return;
      }
         rear = (rear+1)% size;
         arr[rear] = n;
         return;
     }

     public static void peekCircular(){
       if(isEmpty()) {
        System.out.println("Circular queue is empty");
        return;
      }
       
      System.out.println(arr[front]);
     }
     public static void dltCircular(){
       if(isEmpty()) {
        System.out.println("Circular queue is empty");
         return;
      }
      if((front + 1)% size == rear) {
        System.out.println(arr[front]);
        rear = -1;
        front = -1;
        return;
      }
      System.out.println(arr[front]);
      front = (front +1)% size;
     }

    public static void main(String[] args){
      Implementation s = new Implementation(2);
      // s.add(2);
      // s.add(4);
      // s.add(5);
      // s.dlt();
      // s.peek();
      //todo circular array
      s.addCircular(5);
      s.addCircular(9);
      s.dltCircular();
      s.addCircular(3);
      s.peekCircular();
      // s.addCircular(4);
    }
}
