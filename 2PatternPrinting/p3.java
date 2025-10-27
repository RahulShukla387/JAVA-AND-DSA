//                     // Question butterfly pattern in the java

// import java.util.Scanner;

// public class p3 {
// public static void main(String[] args) {
//     System.out.println("enter the no of even rows");
//    Scanner sc = new Scanner(System.in);
//     int row = sc.nextInt();
//     System.out.println("Enter the no of even star in a row");
//     int cols = sc.nextInt();
//     for(int i=1; i<=row/2; i++){
//         for(int j=1;j<=cols; j++){
//             if(j>i && j<cols-i+1){
//                 System.out.print(" ");
//             }
//             else{
//                 System.out.print("*");
//             }
//         }
//         System.out.println();
//     }
//     for(int i=1; i<=row; i++){
//         for(int j=1;j<=cols; j++){
//             if(j<=cols/2-i+1 || j>cols/2+i-1 ){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
// }
    
// }

// //                    SOLID RHOMBUS PATTERN
// import java.util.*;
// public class p3{
// public static void main(String[] args) {
//     System.out.println("Enter the no of rows");
//     Scanner sc = new Scanner(System.in);
//     int row = sc.nextInt();
//     System.out.println("Enter the no of cols");
//     int cols = sc.nextInt();
//     for(int i=1;i<=row;i++){
//         for(int j=1; j<=cols; j++){
//            if(j<row-i+1 || j>cols-i+1){
//             System.out.print(" ");
//            }
//            else{
//             System.out.print("*");
//            }
//         }
//         System.out.println();
//     }
// }
// }

//                    HOLLOW RHOMBUS PATTERN
import java.util.*;
public class p3{
public static void main(String[] args) {
    System.out.println("Enter the no of rows");
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    System.out.println("Enter the no of cols");
    int cols = sc.nextInt();
    for(int i=1;i<=row;i++){
        for(int j=1; j<=cols; j++){
            if(j<row-i+ 1|| j>cols-i+1 ){
                            System.out.print(" ");
                           }
                        else{
                           if(i>1 && i<row){
                            if(j>row-i+1 && j<cols-i+1){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("*");
                            }
                           }
                           else{
                            System.out.print("*");
                           }
                           }
                        }
                        System.out.println();
        }
    }
}
