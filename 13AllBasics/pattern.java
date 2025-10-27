public class pattern {
    //todo Printing upper and lower triangle
    public static void ULT(){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(j<4-i){
                    System.out.print(" \t");
                }
                else{
                    System.out.print("* \t");
                }
            }
            System.out.print("\n");
        }
        for(int i=0; i<5; i++){
            for(int j=5; j>0; j--){
                if(j<=5-i){
                    System.out.print("* \t");
                }
                else{
                    System.out.print(" \t");
                }
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        ULT();
    }
}
