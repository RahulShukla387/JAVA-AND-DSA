import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class bitFunction {

    public static void oddEven(int binarydigit){
      
     if((binarydigit & 1) ==0 ){
        System.out.println("The no is even ");
     }
     else{
        System.out.println("The no is odd");
     }
    }
    public static void binary(int n){
        int decimal =0;
        int pow =0;
        while(n>0){
            int lastdigit = n%10 ;
            decimal += lastdigit*Math.pow(2, pow);
           n= n/10;
           pow++;
             }
        System.out.println("The decimal of given binary no is  " + decimal);

    }
    public static void getIthBit(int binary , int i){
         if((binary & (1<<i)) !=0){
            System.out.println("1 at ith position");
         }
         else{
            System.out.println("0 at ith position");
         }
    }
    public static void setIthBit(int n, int i){
        int result = n|(1<<i);
        System.out.println("The result of after seting 1 at ith position is " + result);
    }
    public static void clearIthBit(int n, int i){
        int result  = n& (~(1<<i));
        System.out.println("The result after removing ith position is  "+result);
    }
    public static void update(int n , int i , int value){
        // todo method 1
        clearIthBit(n, i);  // now ith position of n  is cleared;
        int result = n|(value<<i);
        System.out.println("updated value of number are  " + result);
          
    }
    public static void ClearLastIthBit(int n, int i){
        int result = n&(-1<<i);
        System.out.println(result);
    }
    public static void ClearRange(int n, int j, int i){
        int x = (-1<<j+1) | ((1<<i)-1);
        int result = n&x;
      
        System.out.println("After clearing the range no is  "+result);
    }

    public static void powerOfTwo(int n){  // if user enter the no in binary first it will  convert it into decimal here let 1000 = 8.
         if((n & (n-1)) ==0 && n>0){            //  now here again converted into binary
             System.out.println(n+ " is in the power of two");   // the output will in decimal again. i.e n=8;
         }
         else{
            System.out.println("The no is not the power of two");
         }
    }
    // method 1  time complexity O(n)
    public static void setBitCount(String no){
        int count =0;
        for(int i=0; i<no.length(); i++){
            if( no.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println("Total set bit is " + count);
    }

          // ** method2 time complexity O(logn)
        public static void setBitCount(int n){
            int count =0;
            while (n>0) {
                if((n&1) !=0){
                    count++;
                }
                n = n>>1;
            }
            System.out.println(" Total set bit is  " + count);
        }         
        
               //todo fast Exponentation.*** timeComplexity O(logn)
               public static void FastExponentation1(int a, int n){
                int answer =1;
                while(n>0){
                if((n&1) != 0){  // in the comparison it autometically convert into the binary so no need to extra convert it explicitly
                    answer = answer*a;
                }
               n= n>>1;  // to check last digit we always shift n to 1 digit right
                a = a*a;
            }
            System.out.println("The exponent result is  " + answer);
               }
    // public static void main(String[] args) {
    //     System.out.println("Enter the no in decimal");
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     // oddEven(binary);
    //     // getIthBit(binary, 3);
    //     // setIthBit(binary, 2);
    //     //  clearIthBit(binary, 2);
    //     //  update(binary, 2, 0);
    //     // ClearLastIthBit(n, 2);
    //     ClearRange(n, 5, 1);
    // }

    public static void main(String[] args) {
        System.out.println("Enter the no in binary");
        Scanner sc = new Scanner(System.in);
        // String bString = sc.next();
        // // int binary = Integer.parseInt(bString , 2);
        // // ClearRange(binary, 7, 2);
        // // powerOfTwo(binary);
        // setBitCount(bString);
        int n = sc.nextInt();
        // String s = Integer.toString(n);
        // setBitCount(s);
        // setBitCount(n);
        FastExponentation(n, 4);
    }
}
