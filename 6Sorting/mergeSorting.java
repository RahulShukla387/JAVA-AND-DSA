import java.util.*;

public class mergeSorting {
      public static void print(int[] arr){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
      }
    public static void mergeSort(int[] arr, int st, int end){
        //base case
        if(st >= end){
           return;
        }
            int mid = st + (end-st)/2;
            mergeSort(arr, st, mid); //left part
          mergeSort(arr, mid+1, end); // right part
          merge(arr, st, mid, end);
    }
    public static void merge(int[] arr, int st, int mid, int end ){
        int i = st;
        int j = mid+1;
        int k =0;
        int[] temp = new int[end -st +1];
        while (i<=mid && j<= end) {
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            temp[k++] = arr[i++];
        }
        while (j<=end) {
            temp[k++] = arr[j++];
        }
        // copy into original array

        for( k =0 , i=st; k< temp.length; k++ , i++){
            arr[i] = temp[k];
        }
    }
public static void main(String[] args) {
    int arr[] = {6, 3, 5, 2, 9, 4,4,3, -3};
    mergeSort(arr, 0, arr.length-1);
          print(arr);

}
}
