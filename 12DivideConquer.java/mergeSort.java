public class mergeSort {
public static void mergesort(int arr[], int si, int ei){
    // base condition
    if(si>=ei){
        return;
    }
    // work
    int mid = si + (ei-si)/2;
    // for left
    mergesort(arr, si, mid);
    //for right part
    mergesort(arr, mid+1, ei);
    merge(arr , si, mid, ei);
}
 public static void merge(int arr[], int si, int mid , int ei){
    int i = si; // iteration for left part;
    int j = mid+1;// iteration for right part;
    int k=0; // for storing the element in the temp array;
    int temp[] = new int[ei-si +1];
    while (i<=mid && j<=ei) {
        if(arr[i]<arr[j]){
          temp[k]= arr[i];
          k++;
          i++;
        }
        else{
            temp[k] = arr[j];
            k++;
            j++;
        }
    }
    while(i<=mid){
        temp[k++] = arr[i++];
    }
    while(j<=ei){
        temp[k++] = arr[j++];
    }
    for(k=0 , i=si;k < temp.length; k++ , i++){ // running same loop for both i and k so that it can store both value
         arr[i] = temp[k];  // restoring all the values of array i into array temp;
    }
 }
 public static void print(int arr[]){
    for(int i=0; i< arr.length; i++){
        System.out.print(arr[i] + "\t");
    }
 }
    public static void main(String[] args) {
        int array[] = {4, 6, 3, 2, 5, 8};
        mergesort(array, 0, array.length-1);
        print(array);
    }
}
