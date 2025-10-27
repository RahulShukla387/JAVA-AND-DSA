
public class selectionSort {
    public static void selectionSort(int array[]){
        for(int i=0; i<array.length-1; i++){
            int min =i;
            for(int j=i+1; j<array.length; j++){
              if(array[min]> array[j]){
              min = j;
              }
              
            }
            // swapping
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + "  ");
        }
    }
    public static void main(String[] args) {
        int list[] ={4, 9, 5, 2, 7, 8, 10,5};
        selectionSort(list);
    }
}
