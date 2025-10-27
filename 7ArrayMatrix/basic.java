import java.util.Scanner;

public class basic {
    public static void basicArray (int matrix[][]){
     for(int i=0; i<matrix.length; i++ ){
        for(int j=0; j<matrix[0].length; j++){
            System.out.print(matrix[i][j] + "  ");
        }
        System.out.println();
     }
    }

    public static void search(int matrix[][]){
        for(int i=0; i<matrix.length; i++ ){
            for(int j=0; j<matrix[0].length; j++){
              if(matrix[i][j]==1){
                     System.out.println("You repeat the matrix at index " + i + "," + j);
              }
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the matrix  " + "  ");
        int array[][] = new int[4][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< array.length; i++){
            for(int j=0; j< array[0].length; j++){
             array[i][j] = sc.nextInt();

            }
        }
           basicArray(array);
           search(array);
    }
}
