import java.util.*;;

public class ArrayListStack {
    // checking if the stack is empty
    ArrayList<Integer> stack = new ArrayList<>();
    public boolean isEmpty(){
         return stack.size() ==0;
    }
     // push => adding the value in the stack
      public int push(int data) {
        stack.add(data);  // its return type is a boolean
        return data;
      }
      // pop => Deleting the value from Arraylist
      public int pop(){
        int value = stack.get(stack.size()-1);
        stack.remove(stack.size()-1); // its return type is a boolean
        return value;
      }

      //peep => Seeing the value 
      public int peep(){
        int value = stack.get(stack.size()-1);
        return value;
      }
    public static void main(String[] args) {
       ArrayListStack s = new ArrayListStack();
       s.push(4); 
       s.push(3); 
       s.push(2); 
       while (!s.isEmpty()) {
        
           System.out.println(s.peep());
           s.pop();
       }
    }
}
