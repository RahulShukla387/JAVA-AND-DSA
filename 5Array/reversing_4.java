public class reversing_4 {
    public static void reverse(int array[]){
        int n = array.length;
        for(int i=0; i<n/2; i++){
            int temp = array[i];
            array[i] = array [n-i-1];
            array[n-i-1] = temp;
        }
        System.out.println("The sorted array is ");
        for(int i = 0; i<n; i++){
            System.out.print("\t" + array[i]);
        }
    }
    public static void main(String[] args) {
        int array[] = {4, 6, 3, 9,5};
        reverse(array);
    }
}
