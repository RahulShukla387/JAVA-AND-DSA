import java.util.ArrayList;
import java.util.Arrays;
 //todo Hashing;
public class freqCount {
    public static void freqCount(int[] arr) {
        // ArrayList<Integer> list = new ArrayList<>();
        //todo Finding the maximum element in the array.
        int max = Integer.MIN_VALUE;
           for(int i=0; i< arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
           }
        int[] freq = new int[max +1];
        for(int i =0; i< freq.length; i++){
          freq[i] = 0;
        }
        for(int i=0 ; i< arr.length; i++){
            freq[arr[i]]++;
        }
        //Printing the value;
        for(int i=0; i< freq.length; i++){
            System.out.print(freq[i] + "\t");
        }
    }
    public static void main(String[] args) {
        int [] given = {1, 2, 3, 4, 5, 2, 3, 1, 1, 1};
        freqCount(given);
    }
}
