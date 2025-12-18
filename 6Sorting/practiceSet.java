public class practiceSet {
    public static void print(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + "  ");
        }
    }
    public static  void bubble(int array[]){
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j< array.length-i-1; j++){
                 if(array[j]< array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                 }
            }
        }
        print(array);
    }
    public static void insertionSortPractice(int[] arr ){
        int n = arr.length;
        //assuming first element as sorted.
        for(int i=0; i< n-1; i++){
            for(int j= i+1; j>0 ; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        print(arr);
    }
    // public static void selection(int array[]){
    //     for(int i=0; i<array.length-1; i++){
    //         int min = i;
    //         for(int j= i+1; j<array.length; j++){
    //             if(array[min]< array[j]){
    //                min = j;
    //             }
    //         }
    //         System.out.println(min);
    //         int temp = array[min];
    //         array[min] = array[i];
    //         array[i] = temp;
    //     }
    //     print(array);
    // }
    // public static void insertion(int array[]){
    //     for(int i=0; i< array.length-1; i++){
    //         for(int j= i+1; j>0; j-- ){
    //             if(array[j-1]< array[j]){
    //                 int temp = array[j];
    //                 array[j] = array[j-1];
    //                 array[j-1] = temp;
    //             }
    //         }
    //     }
    //     print(array);
    // }
    public static void main(String[] args) {
        int array[] = {9,4,3,2,5,7}; 
       // bubble(array);
       //selection(array);
    //    insertion(array);
         insertionSortPractice(array);
    }
}
