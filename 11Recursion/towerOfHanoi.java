public class towerOfHanoi {
    // source = rod1, help = rod2, dest = rod3.
    public static void toh(int n, String source , String help, String dest){
           if(n==1){
            System.out.println(" move the disc" + n + " from " + source + " to " + dest);
             return;
           }
           //step1
           toh( n-1 , source, dest , help);
           System.out.println(" move disc"+ n+ " from " + source + " to " + dest);
           // step2
           toh(n-1, help, source, dest);
          //  System.out.println("total minimum moves it will take is " + (Math.pow(2, n)-1)); // if you will print here it will give this output 3 times.
    }
   public static void main(String[] args) {
    String rod1 = "rod1", rod2 = "rod2", rod3 = "rod3";
    int n=3;
    toh(n,rod1, rod2, rod3);
    System.out.println("total minimum moves it will take is " + (Math.pow(2, n)-1));
   }
}
