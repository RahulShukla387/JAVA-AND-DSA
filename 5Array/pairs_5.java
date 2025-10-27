// public class pairs_5 {
// public static void pairs(int array[]){
//     for(int i= 0; i<array.length; i++){
//         for(int j = i+1; j<array.length ; j++){
//        // System.out.print( "(" +array[i]+ "," + array[j] + ")" +  "\t");  // by using print
//         System.out.format(" (%d, %d) ", array[i], array[j]); //   by using format
//     }
// }
// }
//     public static void main(String[] args) {
//         int pairs[] = {4, 8, 2, 9, 7};
//         pairs(pairs);
//     }
// }

                          // printing subarrays
public class pairs_5 {
public static void pairs(int array[]){
    int tsA =0;
    int sum = 0;
    int sumTotal = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i= 0; i<array.length; i++){
        for(int j = i; j<array.length ; j++){
            System.out.print("(");
            for(int k = i; k<=j; k++){ 
                System.out.format(" %d  ", array[k]); //   by using format
                sum += array[k];
            }
            tsA++;
            System.out.print(")");
            System.out.println( "The sum of the sub array is  " + sum);
            if(min>sum){
                min = sum;
            }
            if(max<sum){
                max = sum;
            }
            sumTotal += sum; 
            sum = 0;
    }
}
System.out.println("\n");
  System.out.format("The min value of the sum is %d and the max value of the sum of the array is %d  ", min, max);
  System.out.println("\nTotal sub array is  " + tsA);
  System.out.println("Total sum of all sub array is  " + sumTotal);
}

public static void maxSAbykadane(int array[]){
    int currentSum =0;
    int maxSum = Integer.MIN_VALUE;
    for(int i=0; i< array.length; i++){
        currentSum += array[i];
        if(maxSum<currentSum){
          maxSum = currentSum;
        }
      if(currentSum<0){
          currentSum = 0;
      }
    }
    System.out.println(" The max sum of the array is  " + maxSum);
}
public static void subarrays(int array[]){
    for(int i=0; i< array.length;i++){
        for(int j=i; j< array.length; j++){
            System.out.print("(");
        for(int k=i; k<=j; k++){
            System.out.print( array[k]+ ",");
        }
        System.out.print(")");
        System.out.println();
        }
    }
}
    public static void main(String[] args) {
        int pairs[] = { 1, 78,-5, 7, -9};
        subarrays(pairs);
        // pairs(pairs);
        // maxSAbykadane(pairs);
    }
}