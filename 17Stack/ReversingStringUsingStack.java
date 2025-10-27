import java.util.*;
public class ReversingStringUsingStack {

    //todo Reversing the string using stack; flipcart , paytm.

    public static String Reverse (String s){
        StringBuilder sb = new StringBuilder();
        Stack<Character> list = new Stack<>();
        for(int i =0; i< s.length(); i++){
            list.push(s.charAt(i));
        }
         for(int i =0; i< s.length(); i++){
            char res = list.peek();
             sb.append(res);
             list.pop();
         }
         return sb.toString();
    }
    
    //todo reversing stack in big O(1) space complexity.

    public static void pushAtBottom(Stack<Integer> s, int data){
       if(s.isEmpty()){
        s.push(data);
        return;
       }
        int val = s.pop();
        pushAtBottom(s, data);
        s.push(val);
    }
  
    public static void ReversingStack(Stack<Integer> s){
        if(s.isEmpty()){
          System.out.println("Stack is empty");
            return; 
        }
        int data = s.pop();
        ReversingStack(s);
         pushAtBottom(s, data);
    }
    public static void print (Stack<Integer> s){
        while(!s.isEmpty()){
            int val = s.peek();
            System.out.print(val + "\t");
            s.pop();
        }
    }
 public static void main(String[] args) {
    ReversingStringUsingStack p = new ReversingStringUsingStack();
    System.out.println(p.Reverse("RahulP"));
    Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(1);
        s.push(5);
        s.push(4);
        ReversingStack(s);
        print(s);
 }
}
