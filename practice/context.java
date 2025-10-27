

import java.util.Scanner;
public class context {
    
     public static void main (String[] args){
        System.out.println("enter string" );
         Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        
         for(int i=0; i< sb.length(); i++){
              if( i+2< sb.length() && sb.charAt(i) == 'F' && sb.charAt(i+1) == 'F' && sb.charAt(i+2) =='T' ){
                  sb.setCharAt(i, 'T');
                  sb.setCharAt(i+1, 'F');
                  sb.setCharAt(i+2, 'F');
              }
              if( i+2< sb.length() && sb.charAt(i) == 'N' && sb.charAt(i+1) == 'T' && sb.charAt(i+2) =='T' ){
                  sb.setCharAt(i, 'T');
                  sb.setCharAt(i+1, 'T');
                  sb.setCharAt(i+2, 'N');
              }
         }
         System.out.print(sb);
     }
}
