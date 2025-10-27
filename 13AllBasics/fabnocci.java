import java.util.*;;
public class fabnocci {
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
  public static void main(String[] args) {
    // fabnocci(2);
    // System.out.println( no1(7) );
    // System.out.println(fac(5));
    // System.out.println(digit(4635 , 0));
    // System.out.println(digit(4635));
    System.out.println(reverse(4635 , 0));
    
  }  
}
