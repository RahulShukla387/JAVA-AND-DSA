import java.util.Scanner;
import java.util.*;

public class searching {
    //todo In binary algorithm first sort then will appy binary search.
    public static void BinarySearch(){
        System.out.println("Enter the count of array from which you want to search");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] num = new int[n];
      System.out.println("Enter the array numbers");
      for(int i=0; i<n; i++){
       num[i] = sc.nextInt();
      }
      System.out.println("Numbers you entered are");
      for(int i=0; i<n; i++){
        System.out.print(num[i] + "\t");
      }
      for(int i=0; i<n; i++){
          int min =i;
        for(int j=i; j<n; j++ ){
            if(j+1 <n && num[j+1]< num[min]){
                min = j+1;
            }
        }
        // num[i] = num[i] + num[min];
        // num[min] = num[i] - num[min]; 
        // num[i] = num[i] - num[min]; 
        int temp = num[i];
        num[i] = num[min];
        num[min] = temp;
      }
      System.out.println("\n The sorted array are ");
      for(int i=0; i<n; i++){
        System.out.print(num[i] + "\t");
      }
    //todo now applying the binary search;
    int start =0, end = n-1, mid , target;
    System.out.println("\n Enter the no you want to search");
    target = sc.nextInt();
    while (start<=end) {
        mid = start + (end-start)/2;
        if(num[mid] == target){
            System.out.println("In sorted Array , Number you are searching is at index: " + mid);
            break;
        }
        else{
            if(mid < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
    }
    }
    public static void main(String[] args) {
        BinarySearch();
    }
}
