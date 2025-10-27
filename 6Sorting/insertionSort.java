
public class insertionSort {
    public static void insertionSort(int array[]){
        for(int i=1; i<array.length; i++){
            for(int j=i; j>0;j-- ){
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
             for(int i=0; i<array.length; i++){
                System.out.print(array[i] + "  ");
             }
    }
    public static void insertionSort1(int array[]){
        for(int i=1; i<array.length; i++){
            int end = i;
            int start = 0;
         while(end > start){
            if(array[end]< array[end-1]){
                int temp = array[end];
                array[end] = array[end-1];
                array[end-1] = temp;
            }
            else{
                  break;
            }
           end--;
         }
        }
        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + "  ");
        }
    }
public static void main(String[] args) {
    int list[] ={4, 9, 5, 1,7, 6,-1, 5, 9, 11,10, 8};
    insertionSort1(list);
}    
}
