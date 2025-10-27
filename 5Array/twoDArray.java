import java.util.*;
public class twoDArray {
    public static void print(int[][] array){
  for(int i= 0; i< 4; i++){
        for(int j =0; j< 4; j++){
           System.out.print(array[i][j] + "\t");
        }
        System.out.println();
    }
    }
    public static void printingArray(){
int [][] array = new int[4][4];
    System.out.println("enter the  value of array");
    for(int i= 0; i< 4; i++){
        for(int j =0; j< 4; j++){
            Scanner sc = new Scanner(System.in);
           array[i][j] = sc.nextInt();
        }
    }
    }
    public static void reversingArray(){
        int [][] array = new int[4][4];
    System.out.println("enter the  value of array");
    for(int i= 0; i< 4; i++){
        for(int j =0; j< 4; j++){
            Scanner sc = new Scanner(System.in);
           array[i][j] = sc.nextInt();
        }
    }
    for(int i= 0; i< 4; i++){
        for(int j=0; j< 2; j++){
             int temp = array[i][j];
              array[i][j] = array[i][4-j-1];
             array[i][4-j-1] = temp;
        }
    }
    print(array);
    }
    public static void PrintingArrayColomsWise(){
         int [][] array = new int[4][4];
    System.out.println("enter the  value of array");
    for(int i= 0; i< 4; i++){
        for(int j =0; j< 4; j++){
            Scanner sc = new Scanner(System.in);
           array[i][j] = sc.nextInt();
        }
    }
    for(int j= 3; j >=0; j--){
        for(int i=0; i< 4; i++){
                 System.out.print(array[i][j] + "\t");
                }
                System.out.println();
    }
    }
    public static void printOrder(){
          int [][] array = new int[4][4];
    System.out.println("enter the  value of array");
    for(int i= 0; i< 4; i++){
        for(int j =0; j< 4; j++){
            Scanner sc = new Scanner(System.in);
           array[i][j] = sc.nextInt();
        }
    }
     int sum =0 , n=4 ;
     while (sum <= 2*(n-1)) {
        for(int i= 0; i<= sum; i++){

            if(sum-i < n && i< n){
                System.out.print(array[sum-i][i] + "\t");
            }
        }
        sum++;
     }
    }
  public static void main(String[] args) {
        // reversingArray();
    // PrintingArrayColomsWise();
    printOrder();

  }  
}
