import java.util.Scanner;

public class practice {
      //           Checking Number Pallindrome 
        // logic => By ArrayList  ,  StringBuilder, by reversing digits

        // By reversing reversing digits;

        public static void Pallindrome (int n){
            int out =0;
            int inp =n;
          while(n>0){
            int x = n%10;
            out = out*10 +x;
            n = n/10;
          }
          System.out.println("You entered " + inp);
            if(inp == out){
                System.out.println("Entered no is pallindrome");
            }
            else{
                System.out.println("The enterd no is not pallindrome");
            }
        }

                // Sum of the digits
            public static void digitSum(int n){
                int sum =0;
                while(n>0){
                    int x = n%10;
                    sum += x;
                    n /=10;
                }
                System.out.println("Your sum of the digit is  " + sum);
            }
    public static void main (String args[]){
      System.out.println("Enter the no you want to check");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      sc.close();
      Pallindrome(a);
       digitSum(a);
    }
}

