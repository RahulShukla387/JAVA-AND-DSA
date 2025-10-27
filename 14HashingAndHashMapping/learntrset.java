import java.util.*;
public class learntrset {
    //todo non repeating integers.
    public static void nonRep(int[] arr){
        TreeSet <Integer> no = new TreeSet<>();
        for(int i=0; i< arr.length; i++){
            no.add(arr[i]);
        }
        System.out.println(no.size());
        System.out.println("In increasing order " + no);
    }
public static void main(String[] args) {
    int [] array = {4, 2, 5, 1 , 2, 3, 1};
    nonRep(array);
}
}
