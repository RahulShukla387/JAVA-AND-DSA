import java.util.*;;
public class StockSpanProblem {
    public static void StockSpan(int[] stock, int[] span){
        Stack <Integer> s = new Stack<>(); // in this we will pushout the position/index of prev
      span[0] = 1;
      s.push(0);
      for(int i =1; i< stock.length; i++){
        int currPrice = stock[i];
        while (!s.isEmpty() && currPrice > stock[s.peek()] ) {
            s.pop();
        }
        if(s.isEmpty()){
            span[i] = i+1;
        }
        else{
            int prev = s.peek();
            span[i] = i- prev;
        }
        s.push(i);
      }
    }

    // //todo Next Greater Element Time complexity => 0(3n);
   
     public static void NextGreater(int[] arr, int[] NextGreater){  //ex arr = [6, 8, 0, 1, 3];
     Stack <Integer> s = new Stack<>();
     for(int i = arr.length -1; i>=0; i--){
        while(!s.isEmpty() && arr[i] >= arr[s.peek()]){
            s.pop();
        }
        if(s.isEmpty()){
           NextGreater[i] = -1; 
        }
        else NextGreater[i] = arr[s.peek()];
        s.push(i);
     }
     }
    //   //todo NGECyclic
    //   public static void NextGreater(int[] arr, int[] NextGreater){
    //     int n = arr.length;
    //     for(int i=0; i<2*n; i++){
    //         NextGreater[i] = -1;
    //     }
    //     Stack<Integer> s = new Stack<>();
    //     for(int i =0; i< 2; i++){
    //         while (!s.isEmpty() && arr[s.peek()]< arr[i]) {
    //                NextGreater[s.pop()] = arr[i];
    //         }
    //         if(i<n){
    //             s.push(i);
    //         }
    //     }
    //   }

public static void main(String[] args) {
    // int[] arr = {100, 80, 60, 70, 60, 85, 100};
    int[] arr = {4, 5, 2, 2, 5};
    int[] span = new int[arr.length];
     StockSpanProblem s = new StockSpanProblem();
    //  s.StockSpan(arr, span);
    s.NextGreater(arr, span);
     for(int i =0; i< span.length; i++){
        System.out.print(span[i] + "\t");
     }
} 
}
