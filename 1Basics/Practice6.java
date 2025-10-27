
//   // Question: Write a program that reads a set of integers,and then prints the sum of the even and odd integers
// import java.util.*;
// public class Practice6 {
//     public static void main(String[] args) {
//         System.out.println("Eneter the no of digits you want to enter");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println("Enter the digit");
//         int even =0 , odd =0;
//         int[] array = new int[n];
//         for(int i=0; i<n; i++){
//         array[i] = sc.nextInt();
//         if(array[i]%2==0){
//          even = even + array[i];
//         }
//         else{
//             odd = odd +array[i];
//         }

//         }
//         System.out.println("The sum of even no is " + even + " The sum of odd is " + odd);
//     }
// }


// Question: Write a program that reads a set of integers,and then prints the sum of the even and odd integers 

import java.util.*;
public class Practice6 {
public static void main(String[] args) {
    System.out.println("enter the no of digits you want to enter");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int odd =0 , even =0;
    for(int i=0; i<n;i++){
        int num = sc.nextInt();
        if(num%2==0){
         even += num;
        }
        else{
            odd += num;
        }
    }
    sc.close();
    System.out.println("The sum of even no is " + even + " The sum of odd no is " + odd);
}
    
}