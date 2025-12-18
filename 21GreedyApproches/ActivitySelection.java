import java.util.*;

public class ActivitySelection {

  //todo sorting the end

    public void sortEnd(int[] st, int [] en){
         int[][] tosort = new int[st.length][2];
         //putting into tosort
           for(int i =0; i< st.length; i++){
             tosort[i][0] = st[i];
             tosort[i][1] = en[i];
        }
    
        // bubble sort of end wrt start
        for(int i =0; i< tosort.length; i++){
            for(int j =0; j< tosort.length -i -1; j++ ){
                if(tosort[j][1] > tosort[j+1][1] ) {
                    //swapping
                     int[] temp = {tosort[j][0], tosort[j][1]};
                     tosort[j][0] = tosort[j+1][0];
                     tosort[j][1] = tosort[j+1][1];
                     tosort[j+1][0] = temp[0];
                     tosort[j+1][1] = temp[1];
                }
            }
        }
        for(int i =0; i< tosort.length; i++){
            st[i] = tosort[i][0];
            en[i] = tosort[i][1];
        }
    }
   
    public void print(int[] st, int[] en ){
        for(int i=0; i<st.length; i++){
            System.out.println(st[i] + "-> " + en[i] );
        }
    }

    //todo finding activity
    public int Activity(int [] st , int [] en ){
        // Assuming that end array is not sorted according to end.
         sortEnd(st, en);

        int count =1;
        int tr = 0;
        for(int i =0; i< st.length; i++){
           if(en[tr] <= st[i] ){
             count++;
             tr = i;
           }
        }
        return count;
    }

    public void MaxLengthChainPair(int[][] pair ){
       Arrays.sort(pair, Comparator.comparingInt(o -> o[1]));
       int count =1;
       int tr =0;
       for(int i =1; i< pair.length; i++){
          if(pair[tr][1] < pair[i][0] ){
            count++;
            tr = i;
          }
       }
       System.out.println(count);
    }
    public static void main(String[] args) {
        ActivitySelection a = new ActivitySelection();
        // int [] st = {1, 3, 0, 5, 8, 5};
        int [] st = {1, 3, 2, 4};
        int [] en = {5, 7, 6, 2};
        // int [] en = {2, 4, 6, 7, 9, 9};
    //    int res = a.Activity(st, en);
        //    a.sortEnd(st, en);
        //    a.print(st, en);
    //    System.out.println(res);
      int[][] pair = {{5,24}, {39, 60}, {5, 28}, {27, 40}, {50, 90} };
      a.MaxLengthChainPair(pair);
        
    }
}
