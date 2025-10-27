// package BackTracking;
import java.util.*;
public class Array {
    public void printingSubset(String s , int i, ArrayList<String> temp , ArrayList<String> res){
        if(i== s.length()){
            // res.add(new ArrayList<>(temp));
            System.out.println(temp);
            return;
        }
        //not select
        printingSubset(s, i+1, temp, res);
        //selected
        String toAdd = String.valueOf(s.charAt(i));
                 temp.add(toAdd);
         
        printingSubset(s, i+1 , temp  , res);
              temp.remove(toAdd);
    }
    //todo Another way 
     public void printingSubset1(String s, int i, String ans ){
        if(i == s.length()){
            System.out.println(ans);
            return;
        }
        //not select
        printingSubset1(s, i+1, ans);
        //selcting
        printingSubset1(s, i+1, (ans + s.charAt(i)));
     }
     public void allPermutation(String s , int i, String temp , String ans){
        while(temp.length() >0){
        if(i == temp.length() ){
            System.out.println(ans);
            return;
        }
    
         allPermutation(s, i+1, temp, ans = ans + temp.charAt(i));
         
    }
     }
    public void print(int[] arr){
          for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] +"\t");
        }
    }
   public void ReducingArray(int[] arr, int n ){
    if(n == arr.length){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] +"\t");
        }
        return;
    }
    ReducingArray(arr, n+1);
    arr[n] = arr[n]-2;
   }
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 1, 9};
         Array a = new Array();
        //  a.ReducingArray(arr, 0);
         System.out.println();
        //  a.print(arr);
         String value = "abc";
        //  a.printingSubset(value, 0, new ArrayList<>(), new ArrayList<>());
        // a.printingSubset1(value, 0, new String());
        a.allPermutation(value, 0, value, new String());
    }
}
