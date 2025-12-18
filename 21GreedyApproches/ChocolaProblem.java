import java.util.*;
public class ChocolaProblem {
   
    public void ChocolaProblem(int[] hor, int[]ver ){
         Arrays.sort(hor);
         Arrays.sort(ver);
        int totalPrice =0;
        int v = ver.length -1 , h = hor.length -1 ;
        int vp =1, hp =1;
        while(h >= 0 && v >= 0  ){
            if(hor[h] > ver[v] ){
                totalPrice += vp*hor[h];
                hp++;
                h--;
            }
            else {
                totalPrice += hp*ver[v];
                vp++;
                v--;

            }
        }
        while(h >= 0){
            totalPrice += vp*hor[h];
                hp++;
                h--;  
        }
        while(v >= 0 ){
                totalPrice += hp*ver[v];
                vp++;
                v--;
        }
        System.out.println("Total Price of all the piece cut is: " + totalPrice );
    }

    public static void main(String[] args) {
      ChocolaProblem c = new ChocolaProblem();
      int[] vertPrice = {4, 3, 2, 1, 1 };
      int[] horPrice = {4, 2, 1 };
      c.ChocolaProblem(horPrice, vertPrice);
    }
}
