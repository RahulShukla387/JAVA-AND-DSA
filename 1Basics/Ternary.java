// public class Ternary {
//     public static void main(String args[]){
//         // if(8>5){
//         //     System.out.println("Hi Rahul how are you. ");
//         // }
//         // else{
//         //     System.out.println("mero ko kya");
//         // }
//       String name = (8>5)?"hi rahul": "how are you";
//       System.out.println(name);
//     }
// }

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {
        while(true){
        System.out.println("Please enter your marks");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
     String check = (x>=33)?"Congratulation you are Pass":"Sorry you got fail try next time";
     System.out.println(check);
    }
}
}