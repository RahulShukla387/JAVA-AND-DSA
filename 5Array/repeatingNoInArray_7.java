

public class repeatingNoInArray_7{
    public static void repeat(int array[]){
        for(int i=0; i<array.length-1; i++){
            if(array[i]!=array[i+1]){
                int temp = array[i+1];
                array[i+1]= array[i];
                array[i] = temp;
            }
            else{
                System.out.println(array[i]);
            }
        }
    }
    public static void main(String[] args) {
        int array[] = {4, 8, 7, 8, 4, 7};
        repeat(array);
    }
    
}
