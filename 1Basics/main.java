// import java.util.Scanner;

// public class practice {
//     public static void main(String args[]){
//         System.out.println("Enter a, b, c for average");
//         Scanner sc = new Scanner(System.in);
//        int a =  sc.nextInt();
//        int b =  sc.nextInt();
//        int c =  sc.nextInt();
//        double average = ((a+b+c)/3.0);
//       // double average = (double)(a+b+c)/3;
//        System.out.println("The average of the no is \t" + average);
//     }
// }

import java.util.*;
public class main {
    public static void main(String args[]){
        System.out.println("Enter the cost of pen, pencil , eraser");
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float Actual = (pen + pencil+ eraser);
         float gst = (Actual*0.18f);
         float total = (Actual+ gst);
         System.out.println("Yout Actual cost is " + Actual);
         System.out.println("Yout total cost after adding tax is " + total);
    }
}