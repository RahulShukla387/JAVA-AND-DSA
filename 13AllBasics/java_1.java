import java.util.Scanner;

public class java_1 {
    //todo problem 1 printing prime no 
    public static void Prime(){
        System.out.println("Enter the no you want to check the prime ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = false;
      for(int i=2 ; i*i<= n; i++){
        if(n%i==0){
            result = true;
            break ;
        }
      }
      if(result = false){
          System.out.println("The number you entered is prime");
      }
      else{
        System.out.println("The number you entered is not prime");
      }
    }
    //todo Reversing the integer no;
    public static void ReversingNO(){
        while (true) {
            
            System.out.println("Enter the no you want to reverse");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
           StringBuilder sb = new StringBuilder();
            while (n>0) {
                int lastDigit = n%10 ;
                sb.append(lastDigit);
                n = n/10;
            }
            System.out.println("The reverse no is:" + sb);
        }
    }
    //todo Reversing the string
    public static void ReversingString(){
        System.out.println("Enter the string you want reverse");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i< s.length(); i++){
            char lastChar = s.charAt(s.length()-1-i);
            sb.append(lastChar);
        }
        System.out.println("Reverse String is " + sb.toString());
    }
    public static void main(String[] args) {
        // Prime();
        // ReversingNO();
        ReversingString();
    }
}