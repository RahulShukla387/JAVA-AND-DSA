import java.util.Scanner;

public class sorting {
    //todo Bubble Sorting working but not correct method of sorting have to ask its dry run 

    public static void BubbleSort(){
      System.out.println("Enter the count you want to sort");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] num = new int[n];
      System.out.println("Enter the numbers");
      for(int i=0; i<n; i++){
       num[i] = sc.nextInt();
      }
      System.out.println("Numbers you entered are");
      for(int i=0; i<n; i++){
        System.out.print(num[i] + "\t");
      } 
      for(int i=0; i<n; i++){
        for(int j= 0; j<n; j++){
            if(j+1<n && num[i]>num[j]){
                num[i] = num[i]+num[j];
                num[j] = num[i] - num[j];
                num[i] = num[i] - num[j];
            }
        }
      }
       System.out.println("\n Sorted numbers are: ");
      for(int i=0; i<n; i++){
        System.out.print(num[i] + "\t");
      } 
    }
    //todo buuble sort again 
    public static void BubbleSort1(){
      System.out.println("Enter the count you want to sort");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] num = new int[n];
      System.out.println("Enter the numbers");
      for(int i=0; i<n; i++){
       num[i] = sc.nextInt();
      }
      System.out.println("Numbers you entered are");
      for(int i=0; i<n; i++){
        System.out.print(num[i] + "\t");
      } 
      for(int i=0; i<n; i++){
        for(int j= 0; j<n-1-i; j++){
            if(num[j]>num[j+1]){
                num[j] = num[j]+num[j+1];
                num[j+1] = num[j] - num[j+1];
                num[j] = num[j] - num[j+1];
            }
        }
      }
       System.out.println("\n Sorted numbers are: ");
      for(int i=0; i<n; i++){
        System.out.print(num[i] + "\t");
      } 
    }
    //todo selection sorting 
    public static void SelectionSort(){
      System.out.println("Enter the count you want to sort");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] num = new int[n];
      System.out.println("Enter the numbers");
      for(int i=0; i<n; i++){
       num[i] = sc.nextInt();
      }
      System.out.println("Numbers you entered are");
      for(int i=0; i<n; i++){
        System.out.print(num[i] + "\t");
      } 
      int min;
      for(int i=0; i<n; i++){
         min = i;
        for(int j= i; j<n; j++){
          if(j+1<n && num[j+1]<num[min]){
            min = j+1;
          }
        }
       int temp = num[i];
       num[i] = num[min];
       num[min] = temp;
      }
       System.out.println("\n Sorted numbers are: ");
      for(int i=0; i<n; i++){
        System.out.print(num[i] + "\t");
      } 
    }
    //todo insertion sorting 
    public static void insertionSort(){
      System.out.println("Enter the count you want to sort");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] num = new int[n];
      System.out.println("Enter the numbers");
      for(int i=0; i<n; i++){
       num[i] = sc.nextInt();
      }
      System.out.println("Numbers you entered are");
      for(int i=0; i<n; i++){
        System.out.print(num[i] + "\t");
      } 
     for(int i=0; i<n; i++){
        for(int j=i; j>0; j--){
            if(num[j]<num[j-1]){
              int temp = num[j];
              num[j] = num[j-1];
              num[j-1] = temp;
            }
        }
     }
       System.out.println("\n Sorted numbers are: ");
      for(int i=0; i<n; i++){
        System.out.print(num[i] + "\t");
      } 
    }
   
   public static void main(String[] args) {
        // BubbleSort1();
        // SelectionSort();
        // insertionSort();
    }
}
