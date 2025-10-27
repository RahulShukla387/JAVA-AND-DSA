            // 1   2   3   4
            // 5   6   7   8   
            // 9   10  11  12  
            // 13  14  15  16  

import java.util.Scanner;

public class spiral {
    public static void printspiral(int matrix[][]){
        int strow = 0;
        int stcols = 0;
        int endrow = matrix.length-1 ;
        int endcols = matrix[0].length-1;
        while(strow<= endrow && stcols <= endcols){
            // top row
            for(int j=stcols; j<= endcols; j++){
                System.out.print(matrix[strow][j] + "\t");
            }
            // right cols
            for(int i= strow+1; i<= endrow; i++){
                System.out.print(matrix[i][endcols] + "\t");
            }
            // bottom rows
            for(int j = endcols-1; j>= stcols; j--){
                System.out.print(matrix[endrow][j] + "\t");
                // in the case when single row left at the last
                if(strow == endrow){
                    break;
                }
            }
            // left cols
            for(int i = endrow -1; i>= strow +1; i--){
                System.out.print(matrix[i][stcols] + "\t");
                // in the case when single cols left at the last
                if(stcols == endcols){
                    break;
                }
            }
            stcols++;
            strow++;
            endcols--;
            endrow--;
        }

    }
    public static void main(String[] args) {
        System.out.print("Enter the matrix  now of row and  coloumn of the matrix" + "  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter the element of the matrix  ");
        int array[][] = new int[n][m];
        for(int i=0; i< array.length; i++){
            for(int j=0; j< array[0].length; j++){
             array[i][j] = sc.nextInt();
            }
        }
        sc.close();
        printspiral(array);
    // int array[][] = { }
    }
}
