import java.util.Scanner;
public class prime5 {
    public static void main(String[] args) {
        System.out.println("Enter the no you want to check");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int isPrime =0;
        for(int i = 2; i*i<n; i++){
            if(n%i==0){
              isPrime = 1;
              break;
            }
        }
        if(isPrime==1){
            System.out.println("The no is not Prime");
        }
        else{
            System.out.println("The no is prime");
        }
    }
    
}
