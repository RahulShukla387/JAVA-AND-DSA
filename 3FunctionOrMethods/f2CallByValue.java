// public class f2CallByValue {
//       // function call by value
//       public static int swap (int a, int b){
//              int temp = a;
//              a = b;
//              b= temp;
//              System.out.println("The value of swaped a is " + a+ " and b is " + b);
//              return 0;
//       }
//     public static void main(String args[]){
//      swap(5,8);
//     }
// }


//             // calulating the factorial of a number 
//   public class f2CallByValue {
//      public static int fac(int n){
//         int result =1;
//         for(int i=1;i<=n; i++){
//             result  *=i;
//         }
//          System.out.println("The factorial is " + result);
//         return result;
//      }
//     public static void main(String[] args) {
//      fac(6);
//   }
    
//   }

//             // calulating the Binomial coefficient of a number 
//             // n!/ (n-r)!*r!

// import java.util.Scanner;

// public class f2CallByValue {
//                 public static int fac(int n){
//                    int result =1;
//                    for(int i=1;i<=n; i++){
//                        result  *=i;
//                    }
//                    // System.out.println("The factorial is " + result);
//                    return result;
//                 }
//                 public static float binCoeff(int n , int r){
//                     float BC = fac(n)/(fac(n-r)*fac(r));
//                     System.out.println("The binomial coefficient is " +BC);
//                     return 0;
//                 }
//                public static void main(String[] args) {
//                System.out.println("Enter the value of n and r to find Binomial coefficient");
//                Scanner sc = new Scanner(System.in);
//                int n = sc.nextInt();
//                int r = sc.nextInt();
//                sc.close();
//                binCoeff(n, r);
//              }
               
//              }

//     // checking the prime

// import java.util.Scanner;

// public class f2CallByValue {
//         public static boolean prime(int n){
//             if(n==2){
//                 return true;
//             }
//             for(int i=2; i*i<=n; i++){
//                  if(n%i==0){
//                     return false;
//                  }
//             }
//             return true;
//         }
//     public static void main(String[] args) {
//         System.out.println("Enter the no you want to check");
//         Scanner sc = new Scanner(System.in);
//         int n =  sc.nextInt();
//         sc.close();
//        System.out.println(prime(n));
//     }
        
//     }


//          // Prime in a range by fumction prime

// import java.util.Scanner;
// public class f2CallByValue {

// public static boolean prime(int n){
//                 if(n==2){
//                     return true;
//                 }
//                 for(int i=2; i*i<=n; i++){
//                      if(n%i==0){
//                         return false;
//                      }
//                 }
//                 return true;
//             }
//      public static void primeRange(int n){
//        for(int i=2; i<=n; i++){
//         prime(i);
//         if(prime(i)== true){
//             System.out.println(i);
//         }
//        }
//      }
//     public static void main(String[] args) {
    
//         System.out.println("Enter the no till which you want to print the prime");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         primeRange(n);
//    }
    
//    }

               // Prime in a range directly without function;

             // Prime in a range

import java.util.Scanner;
public class f2CallByValue {


     public static void primeRange(int n){
        int result=0;
       for(int i=2; i<=n; i++){
        if(i==2){
            System.out.println(i);
            continue;
        }
        for(int j =2;j*j<=i; j++){
            if(i%j==0){
                result =0;
                break;
            }
            else{
                result =1;
            }
        }
        if(result ==1){
            System.out.println(i);
        }
       }
     }
    
    public static void main(String[] args) {
    
        System.out.println("Enter the no till which you want to print the prime");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeRange(n);
   }
}
    
   