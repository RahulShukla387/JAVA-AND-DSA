import java.util.Scanner;

public class bd1 {
    public static void main(String[] args) {
        System.out.println("Enter the no of digit you want to convert into decimal");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bin = new int[n];
        int dec =0;
        System.out.println("Enter the digit");
        for(int i=0 ; i<n; i++){
          bin[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            dec += (int)Math.pow(2,i)*bin[n-i-1];
        }
        System.out.println("The decimal no is " +dec);
}
}
