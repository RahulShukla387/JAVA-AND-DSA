// import java.util.Scanner;

// public class p4Diamond {
//     public static void main(String[] args) {
//         System.out.println("Enter the no of even rows");
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int cols = row-1;
//         sc.close();
//         for(int i=1; i<=row/2; i++){
//             for (int j=1; j<=cols; j++){
//                 if(j<row/2 -i+1 || j> row/2 +i-1){
//                     System.out.print(" ");
//                 }
//                 else{
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//         for(int i=1; i<=row/2; i++){
//             for(int j =1; j<=cols; j++ ){
//                 if(j<i || j>cols -i+1){
//                     System.out.print(" ");
//                 }
//                 else{
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

