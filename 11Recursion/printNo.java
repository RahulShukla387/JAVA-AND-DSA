
public class printNo {
    public static void noInDecOrder(int n){
        if (n==1){
            System.out.print(1 +"\t");
           return;
        }
        System.out.print(n + "\t");  // phle n ko print kar do then noInDecOrder(n-1) ko call kro   n , n-1, .......1;
        noInDecOrder(n-1);
    }
    public static void noInIncOrder(int n){
    if(n ==1){
        System.out.print(1 + "\t");
        return;
    }
    noInIncOrder(n-1);                // phle n-1 ko call kar do then n ko print kro then it give output like 1,2, 3, 4........n
    System.out.print(n + "\t");
    }
     public static int fac(int n){
      if(n==1){
        return 1;
      }
        return n*fac(n-1);
     }
     static int sumtillN(int n){
        if(n==0){
            return 0;
        }
              return n+sumtillN(n-1);
     }
    public static void main(String[] args) {
        // noInDecOrder(10);
        // noInIncOrder(10);
    //  System.out.println(fac(10));
     System.out.println(sumtillN(10));
    }
}
