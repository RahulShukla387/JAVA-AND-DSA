import java.util.*;
 
public class context {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
         long x = sc.nextLong();
         long n = sc.nextLong();
         long ld = x %10;
         x = x/10;
          for (long i = 1; i<=n; i++){
              if(ld% 2 == 0) ld -=i;
              else ld += i;
          }
          x = x + ld;
         System.out.println(x);
        }
    }
}



