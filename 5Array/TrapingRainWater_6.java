public class TrapingRainWater_6{
  public static void trapWater(int array[]){
    int n = array.length;
    int[] leftMax = new int[n];
    int[] rightMax = new int[n];
    int twater =0;
    for(int i=1; i<n; i++){
      leftMax[0] = array[0];
    
       if(array[i]>leftMax[i-1]){
            leftMax[i] = array[i];
       }
       else{
        leftMax[i] = leftMax[i-1];
       }
        
     
    }
    for(int i=n-1; i>0; i--){
      rightMax[n-1] = array[n-1];
      rightMax[i-1] = Math.max(rightMax[i], array[i-1]);
    }
    for(int i=0;i<n; i++){
      int waterlevel = Math.min(leftMax[i], rightMax[i]);
      int trappedwater = (waterlevel - array[i])*1;
       twater += trappedwater;
    }
    System.out.println("The total water trapped is  " + twater + " square unit");
  }
   
  public static void StockPrice(int price[]){
    int buyprice = Integer.MAX_VALUE;
    int maxProfit = 0;
    int n = price.length;
    for(int i=0; i<n; i++){
      if(buyprice<price[i]){
        int profit = price[i] - buyprice;
        maxProfit = Math.max(profit, maxProfit);
      }
      else{
        buyprice = price[i];
      }
    }
    for(int i=0; i<n; i++){
    if(buyprice == price[i]){
      System.out.println("you should buy stock at " + (i+1));
    }
  }
    System.out.println("The maximum profit is  " + maxProfit);
  }
    public static void main(String[] args) {
        int array[] = {4, 6, 5, 1, 3, 8};
        //trapWater(array);
        StockPrice(array);
      
    }
}