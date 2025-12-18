import java.util.*;
public class JobSequencing {
  public void JobSequencing(int [][] vp )  {
    Arrays.sort(vp, Comparator.comparingInt(o -> o[0]));
    int profit =0;
    // int time =0;
    for(int i =0; i< vp.length; i++){
        
        int t = vp[i][0];
         int vmax = vp[i][1] ;
        if( i+1 < vp.length &&  vp[i+1][0] == t ){
             int tr = i;
            while( tr+1 < vp.length && vp[tr+1][0] == t ) {
                if(vmax < vp[tr+1][1] ) vmax = vp[tr+1][1];
                tr++;
            }
            t++;
            i = tr;
        }
       
        profit += vmax;

    }
    System.out.println(profit);
  }
  public static void main(String[] args) {
    JobSequencing j = new JobSequencing();
    int[][] arr = {{4, 20}, {4, 10}, {1, 40}, {1, 30} };
    j.JobSequencing(arr);

  }
}
