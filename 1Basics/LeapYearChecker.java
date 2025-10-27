// import java.util.Scanner;

// public class leapYear4 {
//     public static void main(String[] args) {
//         System.out.println("Enter the year you want to check");
//         Scanner sc = new Scanner(System.in);
//         int result;
//         int a = sc.nextInt();
//         if(a%100==0){
//             if(a%400==0){
//                 result =1;
//             }
//             else{
//                 result =0;
//             }
//         }
//     else{
//       if(a%4==0){
//         result = 1;
//       }
//       else{
//         result =0;
//       }
//     }
//     if(result==1){
//      System.out.println("The year is leap year");
//     }
//     else{
//         System.out.println("The year is not the leap year");
//     }
// }
// }

//todo more cleaner version :
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        sc.close();

        if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}



   
