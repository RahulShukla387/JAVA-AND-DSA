import java.util.*;;

public class tailingRec {
     //todo Using loop 
    public static void fabnocci(int n){
      if(n <= 0){
        System.out.println("please enter some valid number");
      }
    int result1 =1;
    int result2 =1; 
    int temp = 1;
    for(int i=1; i<= n-2 ; i++){
         temp = result1 + result2;
       result1 = result2;
        result2 = temp;
    }
    System.out.println(temp);
    }
   //todo Using recursive relation
   public static int fab2(int n){
    if(n==1 || n==2){
        return 1;
    }
    else{
        return fab2(n-1) + fab2(n-2);
    }
   }

   //todo Sum of n natural number using recurssion 

 public static int no(int n){
    if(n==1){
        return 1;
    }
    else{
        return n + no(n-1) ;
    }
   }
   //todo Using tail recursion 
   public static int no1 (int n){
   return no1(n , 0);
   }
   public static int no1 (int n, int res){
      if(n==1){
        return 1 + res;
    }
    else{
        return no1(n-1, n+ res) ;
    }
   }
   //todo factorial using tail recursion
    public static int fac (int n){
   return no1(n , 1);
   }
   public static int fac (int n, int res){
      if(n==0){
        return  res;
    }
    else{
        return no1(n-1, n*res) ;
    }
   }
   //todo count the digits of a number using recursion
   public static int digit(int n , int res){
    if(n == 0){
        return res;
    }
    else{
        res++;
         return  digit(n/10 , res);
    }
   }
   //todo Another method
   public static int digit(int n){
    if(n == 0){
        return 0;
    }
    else{
         return  digit(n/10) +1;
    }
   }
   //todo Reversing a no using recursion
   public static int reverse(int n , int result){
    if(n==0){
        return result;
    }
    else{
        int lastdigit = n%10;
        result = result * 10 + lastdigit;
        return reverse(n/10 , result);
    }
   }
   //todo Reversing an String using iteration.
   public static void ReverseString( String str){
      StringBuilder sb = new StringBuilder();
      for(int i=str.length()-1; i>=0; i--){
        sb = sb.append(str.charAt(i));
      }
      System.out.println(sb.toString());
   }
  
   //todo Reversing an String using recursion.
      
    public static void ReverseString1( String str){
        StringBuilder sb = new StringBuilder(str);
     StringBuilder result =  ReverseString2(sb , new StringBuilder());
    System.out.println(result.toString());
    }
    public static StringBuilder ReverseString2(StringBuilder str , StringBuilder result){
        if(str.length() ==0){
            return result;
        }
        int n = str.length() -1;
        result.append(str.charAt(n));
        str = str.deleteCharAt(n);
      return  ReverseString2(str , result);
    }

    //todo Checking a no is pallindrome using reccussion

    public static int pallindrome2(int n , int result , int result2){
      if(n==0){
        if(result == result2){
            System.out.println("yes no is pallindrome");
        }
        else{
            System.out.println("no");
        }
        return result;
    }
    else{
        int lastdigit = n%10;
        result = result * 10 + lastdigit;
        return pallindrome2(n/10 , result , result2);
    }
    }
    //todo Printing all subsets of a strings 

    public static void set(String str , ArrayList<Character> temp, int index){
      //Base case 
      if(str.length() == index){
         StringBuilder sb = new StringBuilder();
         for (Character c : temp) {
           sb.append(c);
         }
           System.out.println(sb); 
           return;
      }
      //not choose
      set(str, new ArrayList<>(temp), index +1);
      // choose 
      ArrayList <Character> tempcopy = new ArrayList<>(temp);
      tempcopy.add(str.charAt(index));
      
      set(str, tempcopy, index +1);
      
    }
  
     //todo Find the maximum element in an array recursively 
     public static int max(int [] arr , int i , int result){
       if(arr.length == i){
        return result;
       }
       else{
        if(result < arr[i]){
          result = arr[i];
        }
        return max(arr, i+1, result);
       }
     }
     //todo Another method of counting

     public static int max(int[] arr, int i){
      if(arr.length ==1){
        return arr[0];
      }
      if(i+1 < arr.length){

        return Math.max(arr[i], max(arr, i+1));
      }
      return 0;
     }

     //todo Count ways to climb the stairs 1 or 2 steps are allowed
   public static int countTheWays(int n){
    if(n==1 || n==0){
      return 1;
    }
    else{
      return countTheWays(n-1) + countTheWays(n-2);
    }
   }
   //todo Tower of hanoi problem
   public static int toh(int n , int from , int to , int aux, int steps){
         // code here
        if(n==1){
          steps++;
            System.out.println("move disk-->  " + n + "from rod " + from + " to rod" + to);
            return steps;
        }
        //moving from rod1 to rod3
        steps = toh(n-1 , from , aux , to , steps); //todo if we write steps+1 directly it used only in calculation purpose in recursion but if you use steps++ then it stores also.
        steps++;
        //printing the result
       System.out.println("move disk => " + n +  "from rod " + from + " to rod" + to );
          // moving from rod 3 to rod 2
        steps =  toh(n-1 , aux , to , from , steps);

            return steps;
   }

   //todo JOSEPH PROBLEM
   
  public static void main(String[] args) {
    // fabnocci(2);
    // System.out.println( no1(7) );
    // System.out.println(fac(5));
    // System.out.println(digit(4635 , 0));
    // System.out.println(digit(4635));
    // System.out.println(reverse(4635 , 0));
    // System.out.println(pallindrome2(121 , 0 , 121 ));
    String str = "la";
    set(str, new ArrayList<>(), 0);
    // ReverseString1(str);
    int [] arr = {4, 3, 5, 2};
    // System.out.println(max(arr, 0, 0));
    // System.out.println(countTheWays(8));
    // System.out.println(max(arr, 0));
    // System.out.println(toh(3, 1, 2, 3, 0));
  }  
}
