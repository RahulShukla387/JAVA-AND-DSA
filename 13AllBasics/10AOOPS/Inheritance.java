import java.util.*;
class A{
   void sum (int a, int b){
    int sum = a+b;
    System.out.println(sum);
   } 
  void sub (int a, int b){
    int sub = a-b;
    System.out.println(sub);
   } 

}
  
class B extends A {
      void mult (int a, int b){
         int mult = a*b;
         System.out.println(mult);
     }
}
class C extends B {
     void divide (int a , int b){
        int result =  a/b;
        System.out.println(result);
     }
}
    public class Inheritance {
        public static void main(String[] args) {
           C obj = new C();
        // A obj = new A();
           obj.sum(10, 5);
           obj.sub(8,2);
           obj.mult(4,6);
           obj.divide(9,3);
        } 
    }
