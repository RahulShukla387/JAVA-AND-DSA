
//  // question: Print the Hollow rectangle;
// import java.util.Scanner;
// public class p2 {
//     public static void main(String[] args) {
//         System.out.println("Enter the no rows");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println("Enter the star you want in row");
//         int p = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             if(i==1 || i==n){
//                 for(int j=0; j<p; j++){
//                     System.out.print("*\t");
//             }
//             System.out.println("\n");
//         }
//         else{
//             for (int j=1; j<=p; j++){
//                 if(j==1 || j==p){
//                     System.out.print("*\t");
//                 }
//                 else{
//                     System.out.print(" \t");
//                 }
//             }
//             System.out.println("\n");
//         }
        
//     }
//   sc.close();
//     }
// }

//                         // Better Way

//  // question: Print the Hollow rectangle;
//  import java.util.Scanner;
//  public class p2 {
//      public static void main(String[] args) {
//          System.out.println("Enter the no rows");
//          Scanner sc = new Scanner(System.in);
//          int row = sc.nextInt();
//          System.out.println("Enter the star you want in row");
//          int cols = sc.nextInt();
//            for(int i=1; i<=row;i++ ){
//            for(int j=1; j<=cols; j++){
//             if(i==1 || i== row || j==1 || j==cols){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//            }
//            System.out.println();
//            }
    
//      }
//  }


//        // Question: Inverted and rotated half- Puramid pattern 

// import java.util.Scanner;

// public class p2 {
//     public static void main(String[] args) {
//         System.out.println("Enter the no of rows you want to print");
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         for(int i=0; i<row; i++ ){
//             for(int j=1; j<= row; j++){
//                 if(j<(row-i)){
//                     System.out.print("  ");
//                 }
//                 else{
//                     System.out.print("* ");
//                 }
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
        
//     }

//        // Question Inverted half- pyramid with numbers pattern.

// import java.util.Scanner;

// public class p2 {
// public static void main(String[] args) {
//         System.out.println( "Enter the no of the rows" );
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         System.out.println("The pattern is");
//         for(int i =1; i<=row; i++){
//             for(int j=1; j<=6-i;j++){
//                 System.out.print(j);
//             }
//         System.out.println();
//         }
//         sc.close();
//     }
// }

    // // Question Floyd's triangle pattern

    // import java.util.Scanner;
    // public class p2 {
    // public static void main(String[] args) {
    //    System.out.println("Enter the no of rows");
    //    Scanner sc = new Scanner(System.in);
    //    int row= sc.nextInt();
    //    int n = 1;
    //    for(int i= 0; i<row; i++){
    //     for(int j=0; j<=i; j++){
    //          System.out.print(n + "\t");
    //          n++;
    //     }
    //     System.out.println();
    //    }
    //    sc.close();
    // }
        
    // }

    // Question: 0-1 Triangle pattern


     
    import java.util.Scanner;
    public class p2 {
    public static void main(String[] args) {
       System.out.println("Enter the no of rows");
       Scanner sc = new Scanner(System.in);
       int row= sc.nextInt();
       System.out.println("The pattern is");
       int n1 = 1 , n2 =0;

       for(int i= 1; i<=row; i++){
        for(int j=1; j<=i; j++){
             if(i%2==0 ){
               if(j%2==0){
                System.out.print(n1);
               }
               else{
                System.out.print(n2);
               }
             }
             else{
                if(j%2==0){
                    System.out.print(n2);
                }
                else{
                    System.out.print(n1);
                }
             }
        }
        System.out.println();
       }
       sc.close();
    }
    
    }