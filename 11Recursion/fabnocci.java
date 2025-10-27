import java.util.Scanner;
 // By using the recursion.
public class fabnocci {
    public static int fab(int n){
       if(n==1 || n==2){
      return n-1;
       }
      
       return fab(n-1) + fab(n-2);
    }

    // By using the loop 
    public static void fab1(int n){
        int digit1 =0;
        int digit2 =1;
        System.out.print(digit1 + "\t" + digit2 +"\t");
         for(int i=2; i<n; i++){
            
             int result = digit1 + digit2;
             digit1 = digit2;
             digit2 = result;
             System.out.print(result + "\t");
         }
    }
    public static void main(String[] args){
      System.out.println("enter the n till which you want to print");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            System.out.print(fab(i) + "\t");
        }
    // fab1(7);
    }
}
