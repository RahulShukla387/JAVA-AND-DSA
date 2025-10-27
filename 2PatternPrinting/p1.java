// import java.util.Scanner;

// public class p1 {
//     public static void main(String[] args) {
//        System.out.println("Enter the no of rows you want to print ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=0; i<n; i++){
//         for(int j=0; j<=i; j++){
//         System.out.print("*");
//         }
//          System.out.println("\n");
//        }
//        }
// }
// import java.util.Scanner;

// public class p1 {
//     public static void main(String[] args) {
//        System.out.println("Enter the no of rows you want to print ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=0; i<n; i++){
//         for(int j=n; j>=i; j--){
//         System.out.print("*");
//         }
//          System.out.println("\n");
//        }
//        }
// }

// // Question: Printing the half pyramid.

// import java.util.*;
// public class p1 {
// public static void main(String[] args) {
//     System.out.println("Enter the no of rows you want to print");
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     System.out.println("Your pattern is ");
//     for(int i =1; i<=n ; i++){
//         for(int j=1; j<=i; j++){
//             System.out.print(j);
//         }
//         System.out.println();
//     }
// }
    
// }

// Quest: character pattern 

import java.util.*;
public class p1 {
public static void main (String args[]){
System.out.println("Enter the no of rows");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
char x = 'A';
  for(int row =0; row<n; row++){
    for(int j=0; j<=row; j++){
       System.out.print(x +"\t");
       x++;
    }
    System.out.println();
  }
   sc.close();
}
}    
