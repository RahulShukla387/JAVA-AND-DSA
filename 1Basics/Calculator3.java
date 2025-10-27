import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        System.out.println("Enter the a and b");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Enter the operation you want to do , + , - , *, /, %");
        char oper = sc.next().charAt(0);
        switch (oper) {
            case '+':
              System.out.println(a+b);
                break;
             case '-':
             System.out.println(a-b);
             break;
             case '*':
             System.out.println(a*b);
             break;
             case '/':
             System.out.println(a/b);
             break;
             case '%':
             System.out.println(a%b);
             break;
            default:
            System.out.println("Please enter correct operation and operand");
                break;
        }
    }
}
