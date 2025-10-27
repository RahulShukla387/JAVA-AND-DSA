public class chckingSortedArray {
    public static void sortedarray(int array[]){
       // checking ascending order by loop 
       int result =0;
       for(int i=0; i<array.length-1; i++){
        if(array[i+1]>array[i]){
              result = 1;
        }
        else{
        result =0;
        break;
        }
       }
       if(result ==1){
        System.out.println("Array is sorted");
       }
       else {
        System.out.println("Array is not sorted");
       }
    }
    public static int sortedarray1(int array[], int i){
        if(i==array.length-1){
            return 1;
        }
        if(array[i]>array[i+1]){
            return 0;
        }
      return  sortedarray1(array , (i+1));
        
    }
     public static void main(String[] args) {
        int array[] = {2, 4, 3, 6, 5};
    }
}
