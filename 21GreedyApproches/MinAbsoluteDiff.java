
import java.util.*;


public class MinAbsoluteDiff {
   public void MinDiffSum(int[] a, int[] b ){
    Arrays.sort(a);
    Arrays.sort(b);
    int sum =0;
    for(int i =0; i< a.length; i++){
        if(a[i] > b[i] ) sum += a[i] - b[i];
        else sum += b[i] - a[i];
    }
    System.out.println(sum);
   }
    public static void main(String[] args) {
        MinAbsoluteDiff m = new MinAbsoluteDiff();
        int[] a = {3, 5, 4, 8, 7};
        int[] b = { 7, 3, 4, 1,3};
        m.MinDiffSum(a, b);

    }
}
