public class QuickMergeandHeapSort {
    //todo Merge Sort

    public void mergeSort(int[] arr, int st , int en){
       if(st >= en){
        return;
       }
       int mid = st + (en-st)/2;
       mergeSort(arr, st, mid); //left part 
       mergeSort(arr, mid+1, en); //right part
       merge(arr, mid, st, en); // merging the parts correctly
    }
    public void merge(int[] arr, int mid, int st, int en){
       int i = st, j = mid+1, k=0;
       int[] temp = new int[en-st +1];
       while (i<= mid && j<= en) {
          if(arr[i] < arr[j]) temp[k++] = arr[i++];
          else temp[k++] = arr[j++];
       }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= en) {
            temp[k++] = arr[j++];
        }
       //copying the element of temp which is sorted into original array 
       for( k = 0, i = st; k< temp.length; k++, i++){
          arr[i] = temp[k];
       }
    }
    
     //todo Quick sort
      public void QuickSort(int[] arr){
        if(arr.length <=1) return;
         Sort(arr, 0, arr.length-1);
      }

     public void Sort(int[] arr, int st, int en){
        if(en <=st ) return;
        int pvt = pivot(arr, st, en);
        Sort(arr, st, pvt-1);
        Sort(arr, pvt+1, en);
     }

     public int pivot(int[] arr, int st, int en){
        int j = en, i = st;
        int pvt = arr[st];
        while(j>= i){
             if(arr[i] <= pvt) i++;
             else{
                if(arr[j] > pvt ) j--;
                else{
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
             }
                    }
                int temp = arr[st];
                arr[st] = arr[j];
                arr[j] = temp;
               return j;
     }


    public static void main(String[] args) {
        QuickMergeandHeapSort q = new QuickMergeandHeapSort();
        int[] arr = {8, 11, 7, 9, 21, 15, 18, 16 };
        // q.mergeSort(arr, 0, arr.length-1  );
        q.QuickSort(arr);
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + "\t" );
        }

    }

}
