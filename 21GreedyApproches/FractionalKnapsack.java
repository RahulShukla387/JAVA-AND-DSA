import java.util.*;

public class FractionalKnapsack {
    public void FractKnap(Double[] value, Double[] weight , double tw ){
        //will store one more thing that is index to track the sequence
        double[][] toSort = new double[value.length][4];
        for(int i =0; i< toSort.length; i++){
            toSort[i][0] = i;
            toSort[i][1] = value[i];
            toSort[i][2] = weight[i];
            toSort[i][3] = weight[i]/value[i];
        }
        
        //Sort on the basis of value.
        Arrays.sort(toSort, Comparator.comparingDouble(o -> o[3]));
        ArrayList<Double> path = new ArrayList<>();

         int tr =0;
         double total  =0;
        while(tw != 0 && tr< toSort.length){
            if(toSort[tr][2] > tw ){
                total = total + (toSort[tr][1]/toSort[tr][2])*tw;
                path.add(toSort[tr][0]);
                break;
            }
            else{
                 tw = tw - toSort[tr][2];
                 total += toSort[tr][1] ;
                path.add(toSort[tr][0]);
                 tr++;
            }
        }
        System.out.println(total);
        for(int i =0; i< path.size(); i++){
            System.out.print("A" + ( (int)(double)path.get(i)) + "\t" );
        }
    }
    public static void main(String[] args) {
        FractionalKnapsack f = new FractionalKnapsack();
        Double[] value = {60.0, 60.0, 120.0};
        Double[] weight = { 10.0, 20.0, 30.0 };
        f.FractKnap(value, weight, 50);
    }
}
