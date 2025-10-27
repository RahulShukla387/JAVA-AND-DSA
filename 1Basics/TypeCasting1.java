import java.util.*;
public class TypeCasting1 {
     static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
    int count =0;
     ArrayList<Long> list = new ArrayList<>();
     ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<q; i++){
        for(int j=1; j<= query.get(i); j++){
            
            if(query.get(i) %j ==0){
                count++;
            }
            
        }
            if(count == 3){
               list.add(query.get(i));
               count =0;
            }
        
        }
        
        for(int i=0; i< list.size(); i++){
         Long value = list.get(i);
         int no = (int)(long)value;
         result.add(no);
        }
        
        return result ;
    }
    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>();
        list.add(10L);
        list.add(5L);
        list.add(1L);
        list.add(3L);
        System.out.println(threeDivisors(list, 4));
        
    }
}
