import java.util.*;
public class PracticeProblem {
   //todo problem 1 Balanced String Partitions 
  
  // We have balanced string str of size N with an equal number of L and R, the task is to find a maximum number X,such that a given string can be partitioned into X balanced substring. A string is called to be balanced if the number of ‘L’s in the string equals the number of ‘R’s.Input: “LRRRRLLRLLRL”Output: 3 
     public void BalancedString(String s){
        int l = 0 , r =0, count =0;
        for(int i=0; i< s.length(); i++){
            if(s.charAt(i) == 'L'){
                l++;
            }
            else r++;
            if(l !=0 && r != 0 && l == r ) count++;
        }
        System.out.println("The total partitioned substring is : " + count);
     }
      
     //todo Lexicographically Smallest string
     // WehavetwointegersNandK.ThetaskistoprintthelexicographicallysmalleststringoflengthNconsistingoflower-caseEnglishalphabetssuchthatthesumofthecharactersofthe string equals to K where ‘a’ = 1, ‘b’ = 2, ‘c’ = 3, ..... and ‘z’ = 26.Sample Input 1: N = 5, K = 42Sample Output 1: aamzSample Input 2: N = 3, K = 25Sample Output 2: aaw
     public void LexicoSmallest(int n, int k){
        if(n> k) {
            System.out.println("not possible");
            return;
        }
        char [] arr = new char[n];
        for(int i =0; i< n; i++) arr[i] = 'a';
        k = k-n;
        int tr = arr.length;
        while(k> 0){
            tr--;
            k++;
            if(k >= 26 ){
                arr[tr] = 'z';
                k = k-26;
            }
            else{
                char c = (char)('a' + (k-1) );
                arr[tr] = c;
                k = 0;
            }
        }
        String s = "";
        for(int i =0; i< arr.length; i++){
            s += arr[i];
        }
        System.out.println("String is : " + s);
     }
     
     //todo Buy and sell the stock

      public void Stock(int[] arr){
        int profit =0,  min = 0 , buyDay =-1, sellDay = -1 ; 

        if(arr.length < 2) {
            System.out.println("Not possible to trade tere system se bahar hai");
            return;
        }

        for(int i =1; i<arr.length; i++){
           if(arr[i] - arr[min] > profit ) {
            profit = arr[i] - arr[min];
            buyDay = min+1;
            sellDay = i +1;
           } 
           if(arr[i] < arr[min] ) min = i;
        }
   
        System.out.println("The maximum profit possible is -> " + profit + "  buy on day -> " + buyDay + "  sell on -> " + sellDay);
      }

     public static void main(String[] args) {
        PracticeProblem p = new PracticeProblem();
        String s = "LRRRRLLRLLRL";
        // p.BalancedString(s);
        p.LexicoSmallest(5, 42);
        int[] prices = {5, 1, 2};
        p.Stock(prices);
        
     }
}
