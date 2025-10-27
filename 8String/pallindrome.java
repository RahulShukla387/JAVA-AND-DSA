import java.util.*;
public class pallindrome {

             // method 1 to check the pallindrome
    public static void pallindrome1(String input){
        String result ="";
        for(int i=input.length()-1; i>=0; i--){
            result+=input.charAt(i);
        }
        //   if(result == input){ cannot directly compare to the strings in java
        if(result.equalsIgnoreCase(input)){
        System.out.println("given string is pallindrome ");
        } else{
            System.out.println("Given string is not the pallindrome");
        }
    }
                   // method3 to check the pallindrome
    public static boolean pallindrome3(String input){
        int n = input.length();
        boolean result = true;
        for(int i =0; i< n/2; i++){
          if(input.charAt(i) != input.charAt(n-i-1)){
             return false;
           
        }
    }
        return true;
}
public static void displacement(String input){
    int x =0, y=0;
    for(int i=0; i<input.length(); i++){
        if(input.charAt(i)=='W'){
            x--;
        }
        else if(input.charAt(i) == 'E'){
            x++;
        }
        else if(input.charAt(i)== 'N'){
            y++;
        }
        else{
            y--;
        }
        
    }
    System.out.println("the last coordinate is  "+x + "," + y);
    float displacement = (float)Math.sqrt((x*x + y*y));
    System.out.println("The displacement of the point is " + displacement);
}
public static void substring(String input){
    String subString = "";
    for(int i=2; i< input.length();i++){
        subString += input.charAt(i);
    }
    System.out.println(subString);
}
     public static void main(String[] args) {
//         String name = "noon";
//    pallindrome1(name);
//         System.out.println(pallindrome3(name));
// String name = "WNEENESEN";
// String name = "NS";
//    displacement(name);
   String subject = "Rahul Shukla ji";
 substring(subject);
     }
}
