public class Ocurrence {
    public static void Ocurrence(int array[]){
        for(int i=0; i< array.length; i++){
            int count =0;
            for(int j= 0; j<array.length; j++){
              if(array[i] ==array[j] ){
               count++;
              }
            }
            System.out.format("%d occurs %d times", array[i], count);
            System.out.println();
            count =0;
        }
     
    }
   public static void main(String[] args) {
    int array[] =  {4, 7, 5, 4, 9, 8, 5, 2, 1, 2, 4};
   Ocurrence(array);
   } 
}
