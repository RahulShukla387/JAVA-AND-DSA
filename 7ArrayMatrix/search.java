public class search {
    // still time complexity O(n*n)
    public static void search1(int matrix[][], int target){
        int n = matrix.length-1;
        for(int i=0; i<=n; i++){
            for(int j=n+1; j>0; j--){
            if( matrix[0][j-1]<target ){
                if(matrix[i][j-1]==target){
                    System.out.println("target at " + i +","+ (j-1));
                }
            }
            }
        }
    }
     // By using row binary search 
    public static void search2(int matrix[][], int target){
        int startrow = 0;
         int endrow = matrix.length-1;
         while(startrow<=endrow){
            
              int mid1 = (startrow +endrow)/2;
               for(int i=0; i<=endrow; i++){
                if(matrix[i][mid1] == target){
                  System.out.println("your element is at index " + i +", " + mid1);
                  return;
                }
                else{
                    if(matrix[i][mid1]>target){
                        endrow = mid1-1;
                    }
                    else{
                        startrow = mid1+1;
                    }
                }
              }
            }
         }
                // by using stairs case
               public static void stairs(int matrix[][], int target){
                int start = matrix[0].length-1;
               // int end = matrix[0].length-1;
               int k=0;
                while(start>=0 && k<matrix.length){
                  //  for(int i=0; i<matrix.length;i++)
                  if(matrix[k][start]==target){
                    System.out.println("your element is at index " + k +"," + start);
                    return;
                   
                  }
                    if(target< matrix[k][start]){
                        start--; // move left
                    }else{
                          k++; // move down
                    }
                }
                System.out.println("Your searched key are not present in the matrix");
               }
    public static void main(String[] args) {
         int array[][] ={{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50} };
         //search2(array, 29);
         stairs(array, 50);
    }
    
}
