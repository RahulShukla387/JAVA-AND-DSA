// import java.util.Scanner;

// public class Reverse5 {
//     public static void main(String args[]){
//         System.out.println("Enter the no of 4 digit you want to reverse");  // 4598
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] array = new int [4];
//         for(int i =0; i<4; i++){
//         int x = n%10;
//         array[i]= x;
//         n = n/10;
//         System.out.print(array[i]);

//         }
//         sc.close();
//     }
// }

// for any no of digits 


// import java.util.Scanner;

// public class Reverse5 {
//     public static void main(String args[]){
//         System.out.println("Enter the no  you want to reverse");  // 4598
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int reverse = 0;
//        while(n!=0){
//         int digit = n%10;
//         reverse = reverse*10 + digit; // multiply by 10 to create one zero at the last so that the no can be added.
//        n= n/10;
//        }
//        System.out.println(reverse);
//         sc.close();
//     }
// }


// Ques. Keep entering the no till user did not enter the multiple of 10;
import java.util.*;
public class Reverse5 {
public static void main(String[] args) {
    boolean x = true;
    while(x){
 System.out.println("enter the no");
 Scanner sc = new Scanner(System.in);
 float n = sc.nextFloat();
 while(n%10 != 0){
    System.out.println("your no is " + n);
    break;
 }
 if(n%10==0){
   //  x = false;
   continue;
   // System.out.println("You entered multiple of 10");
 }
}
}
}