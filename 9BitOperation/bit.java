import java.util.Scanner;
     
public class bit {
     void lr (int n, int i){
        //todo right shift
        System.out.println(  n>>i);
        //todo left shift
        System.out.println(  n<<i);
    }

    //todo check odd and even
       void eO (int n){
        if((n & 1) == 1) System.out.println("Odd");
        else System.out.println("even");
     }

     //todo get ith bit 
       void ith (int n , int i){
        if((n & (1<<i) ) == 0 ) System.out.println("ith bit is 0");
        else System.out.println("ith bit is 1");
      }
      //todo set ith bit => if ith bit is not 1 then make it 1
      void setith(int n , int i ){
          System.out.println("before set ith bit \t" + n);
         System.out.println( "after seting ith bith \t" +  (n | (1<<i)));
      }                                                             

      //todo clear ith bit => if ith bit is not 1 then make it 0
      void clearith(int n , int i ){
          System.out.println("before clearing ith bit \t" + n);
         System.out.println( "after clearing ith bith \t" +  (n & ~(1<<i)));
      }
    
      //todo clear in range
       void clearRange(int n , int f, int l){
         int r = (~(-1<<l) | (-1 <<f ));
          System.out.println(n & r);
       }
       String  binary(int n ){
        StringBuilder sb = new StringBuilder();
        String res = "";
        while(n >0){
             int ld = n %2;
             sb.append(ld);
             n = n/2;
        }
         sb.toString();
         for(int i = sb.length()-1; i >=0; i--  ){
             res = res + sb.charAt(i);
         }
          return res;
       }
       
       void power(int value, int pow){
          String s = binary(pow);
           int ans =1;
            int count =1;
           for(int i = s.length()-1; i>=0; i-- ){
               if(s.charAt(i)=='1'){
                 ans= ans*(int)Math.pow(value, count);   
               }
               count++;
           
           }
           System.out.println(ans);
       }
      
       //todo efficient way of calculating power 
 static long powLong(long value, long exp) {
    long result = 1;
    long base = value;

    while (exp > 0) {
        if ((exp & 1) == 1) {      // if current LSB is 1
            result *= base;
        }
        base *= base;              // square base for next bit
        exp >>= 1;                 // shift exp right (move to next bit)
    }

    return result;
}
    public static void main(String[] args) {
        bit b = new bit();
          System.out.println("enter the no  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int i = 1;
    //    b.lr(n, i);
    //    b.setith(n, i);
    //    b.clearith(n, i);
    //    b.clearRange(n, 3, 1);
        //   b.binary(n);
        b.power(n, 2);
    }
}
