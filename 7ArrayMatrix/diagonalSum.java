import java.util.Scanner;
public class diagonalSum {
    // time complexity O(n*n);
    // public static void diagonalSum1(int matrix[][]){
    //     int primSum= 0 , secSum = 0 , tsum =0;
    //     int n = matrix.length-1, m= matrix[0].length-1;
    //     for(int i=0; i<=n; i++ ){
    //         for(int j=0; j<=m; j++){
    //             if(i==j){
    //                 primSum +=matrix[i][j]; 
    //                 tsum += matrix[i][j];
    //             }
    //             else if(i+j == m){
    //                   tsum += matrix[i][j];
    //             }
    //         }
    //         secSum += matrix[i][m-i];
            
    //     }
    //     System.out.println("primary diagonal sum is  " + primSum);
    //     System.out.println("secondary diagonal sum is  " + secSum);
    //     System.out.println("total diagonal sum is  " + tsum);
    // }
               // Time complexity  O(n)
    public static void diagonalSum2(int matrix[][]){
        int primSum= 0 , secSum = 0 , tsum =0;
        int n = matrix.length-1, m= matrix[0].length-1;
        for(int i=0; i<=n; i++ ){
        //     if(n%2!=0 && m%2!=0){
        //    primSum+=matrix[i][i];
        //    secSum+=matrix[i][n-i];
        //    tsum = primSum + secSum;
        // }
        // else{
        //     primSum+=matrix[i][i];
        //     secSum+=matrix[i][n-i];
        //       tsum = primSum + secSum - matrix[n/2][m/2];
        // }
          tsum += matrix[i][i];
          if(i!=n-i){
            tsum += matrix[i][n-i];
          }
    }
      //  System.out.println("Primary sum of the matrix is  " + primSum);
       // System.out.println("Secondary sum of the matrix is " +secSum);
        System.out.println("Total sum of the matrix is " +tsum);
    }
    public static void main(String[] args) {
        //int array[][] ={{2, 4, 6, 2}, {3, 4,8, 9}, {4, 6, 2, 7,}, {8, 5,3,7} };
         System.out.print("Enter the matrix  now of row" + "  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =n;
        System.out.println("Enter the element of the matrix  ");
        int array[][] = new int[n][m];
        for(int i=0; i< array.length; i++){
            for(int j=0; j< array[0].length; j++){
             array[i][j] = sc.nextInt();
            }
        }
        sc.close();
        //diagonalSum1(array);
        diagonalSum2(array);
    }
    
}
