import java.util.Scanner;

public class linearSearch_2 {
    public static void linSearch(String menu[], String target){
        boolean result = true;
        for(int i=0; i< menu.length; i++){
     if(target.trim().equalsIgnoreCase(menu[i].trim())){
                System.out.println("your item is at index  " + i);
                result = true;
                break;
            }
            else{
                result =false;
            }
           }
           if(result == false){
              System.out.println("sorry your item not found");
           }

            }
        public static void main(String[] args) {
        String[] list = {"samosa","chai" , "pakoda" , "gulabjamun", "chips" , "  sada water"};
         System.out.println("What you want to chek");
           Scanner sc = new Scanner(System.in);
            String target = sc.nextLine();
            sc.close();
        linSearch(list , target);
    }
}
