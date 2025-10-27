public class practice {

    // if array are sorted
    public static void occurance(int matrix[][], int target){
        int start = matrix.length-1;
        int right =0;
        int count =0;
        while(start>=0 && right< matrix[0].length){
            if(matrix[start][right]== target){
                System.out.format("the target element appear at index  %d, %d", start, right);
                count++;
                right++;
            }
            else{
                if(target > matrix[start][right]){
                    right++;
                }
                else{
                    start--;
                }
            }
            
        }
        System.out.println("The total occurence of the target is " + count);
        
    }
    public static void print(int matrix[][]){
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j< matrix[0].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void transpose(int matrix[][]){
        int result[][] = new int[matrix[0].length][matrix.length];
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
            result[j][i] = matrix[i][j];
            }
        }
        print(result);
    }
    public static void sum(int matrix[][]){
        int sum = 0;
      for(int i=0; i<matrix[0].length; i++){
          sum += matrix[1][i];
      }
      System.out.println("The sum of the 2nd row is  " + sum);
    }
    public static void main(String[] args) {
        int array[][] = {
            {4, 6, 6}, 
            {7, 8, 9},
            {10, 11, 12},
            {13, 14, 15},
        };
        // occurance(array, 6);
        // sum(array);
        transpose(array);
    }
    
}
