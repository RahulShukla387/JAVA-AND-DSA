import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void lowercase(String input) {
        int count =0;
       StringBuilder sb = new StringBuilder(input);
       for(int i=0; i<input.length(); i++){
        if(sb.charAt(i)== Character.toLowerCase(sb.charAt(i))){
             count++;
        }
       }
        System.out.println("Lower case in the given string is  " + count);
    }

    // inefficient way of finding anagram time complexity is O(n);  also not work for repeating letter like aab and bba it will show true/
    public static void anagram(String input1 , String input2){
        boolean check = true;
        if(input1.length() != input2.length()){
                System.out.println("String are not anagram");
                return;
        }
        else{
            for(int i=0; i< input1.length(); i++){
              for(int j=0; j< input1.length(); j++){
                if(input2.charAt(i) !=input1.charAt(j)){
                    check = false;
                }
                else{
                    check = true;
                    break;
                }
              }
              if(check ==false){
                System.out.println("String are not anagram");
                return;
              }
            }
            System.out.println("Given String is anagram");
        }
    }
    public static void anagram1(String input1, String input2){
        if(input1.length() != input2.length()){
            System.out.println("String are not anagram");
            return;
    }
       char inp1[] = input1.toCharArray();
       char inp2[] = input2.toCharArray();
       Arrays.sort(inp1);
       Arrays.sort(inp2);
       if(Arrays.equals(inp1, inp2)){
        System.out.println("Given string are anagram");
       }
       else{
        System.out.println("Given string are not the anagram");
       }
    }
    public static void main(String[] args) {
        System.out.println("Enter two strings to check anagram");
        Scanner sc = new Scanner(System.in);
        String inp1 = sc.nextLine();
        String inp2 = sc.nextLine();
        anagram1(inp1, inp2);
        sc.close();
        // String input = "RahuL";
        // lowercase(input);
    }
}
