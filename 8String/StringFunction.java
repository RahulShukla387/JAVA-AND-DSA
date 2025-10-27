import java.util.ArrayList;

public class StringFunction {
    public static void substring(String input){
        String subString = "";
        for(int i=2; i< input.length();i++){
            subString += input.charAt(i);
        }
        System.out.println(subString);
    }
    // comparing between two two strings
    public static int compare(String inp1, String inp2){
        int n = inp2.length();
        if(inp1.length()>inp2.length()){
            n = inp2.length();
        }
        for(int i=0; i<n; i++){
            if(inp1.charAt(i)>inp2.charAt(i)){
                // System.out.println("String 1 is largesest that is  " + inp1);
                return 1;
            }
            else if(inp1.charAt(i)<inp2.charAt(i)){
                // System.out.println("String 2 is largest i.e  " + inp2);
                return 2;
            }
        }
        return 0;
        // System.out.println("Both String is equals");
    }
       
        // comparing between more than two by using compareTo function.

        public static void compare(String array[]){  // todo we can make same function name of two function but parameters should be different
            String largest = array[0];
            for(int i=0; i<array.length; i++){
                if(largest.compareTo(array[i])<0){
                    largest = array[i];
                }
            }
            System.out.println("The largest string is  "+largest);
        }
        public static void compare1(String array[]){  // todo we can make same function name of two function but parameters should be different
            String largest = array[0];
            for(int i=0; i<array.length; i++){
                if(compare(largest, array[i]) ==2) {
                      largest = array[i];
                }
            }
            System.out.println("The largest string is  "+largest);
        }

        // todo Make every letter of the each word in capital leter
        public static void capital(String input){
            StringBuilder sb = new StringBuilder(input);
           sb.setCharAt(0, Character.toUpperCase(sb.charAt(0))); 
            for(int i=1; i<input.length(); i++){
                if(sb.charAt(i)==' '){
                    sb.setCharAt(i+1, Character.toUpperCase(sb.charAt(i+1)));
                }
            }
           System.out.println(sb);
        }
        // todo String compression 
        public static void compression(String input){
            StringBuilder sb= new StringBuilder();
                         int k =1;
            for(int i=0; i<input.length(); i++){
                sb.append(input.charAt(i));
                while ( i+1<input.length()&&input.charAt(i) == input.charAt(i+1)) {
                    k++;
                    i++;
                }
              
                if(k>1){
                      sb.append(k);
                      k=1;
                    }
              
                  
            }
          System.out.println(sb.toString());
        }
    public static void main(String[] args) {
        // String fname = "Rahul";
        // String sname = "Rahml";
        // compare(fname, sname);
        // String fruits[] = {"mango", "orange", "apple" , "banana", "straberry"};
        // compare1(fruits);
        String sentence = "hi , i am the king of the hearts";
        String name = "pqrst";
        // String name = "ssspppprrrtttt";
       compression(name);
        // capital(sentence);
    }
    
}
