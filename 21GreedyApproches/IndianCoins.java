import java.util.*;

public class IndianCoins {
   public void IndianCoins(int[] den, int value ) {
    Arrays.sort(den);
    int tr = den.length -1 ;
    int count =0;
    while(value != 0 && tr>=0  ){
        if( den[tr] <= value   ){
            while(value >= den[tr] ){
                value -= den[tr];
                count++;
            }
        }
        tr--;
    }
    System.out.println(count);
   }
   public static void main(String[] args) {
    IndianCoins a = new IndianCoins();
    int [] arr = { 1, 2, 5, 10, 15, 20, 50, 100, 500, 2000 };
    a.IndianCoins(arr, 590);
    
   }
}
