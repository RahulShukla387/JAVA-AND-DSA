//                           // Using ArrayList

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Scanner;

// public class db1 {
//     public static void main(String[] args) {
//         System.out.println("Enter the no you want to convert into the binary");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.close();
//         // using ArrayList
//         ArrayList<Integer> list = new ArrayList<>();  // defining a arraylist
//         while(n!=0){
//             list.add(n%2);
//           n=  n/2;
//         }
//         System.out.println("Your binary conversion is ");
//         Collections.reverse(list);
//         for(int i=0; i<list.size(); i++){
//             int result = list.get(i);
//             System.out.print(result +" ");
//         }
//        // System.out.println(list);
        
//     }
// }


//                          // Using StringBuilder

import java.util.Scanner;

public class db1 {
    public static void main(String[] args) {
        System.out.println("Enter the no you want convert into binary");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        StringBuilder list = new StringBuilder();
        while(n>0){
            list.append(n%2);
            n /=2;
        }
        System.out.println("the binary conversion is " + list.reverse().toString());
    }
        
    }