   //todo Mapping of value with its square;

import java.util.*;
public class map {
    public static void map(int[] arr){   // arr[] = 4, 5, 3, 2, 1;
        // Declaring the hashmap;
      HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< arr.length; i++){
            map.put(arr[i], arr[i]*arr[i]);
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            System.out.println(e.getKey() + " ---> " + e.getValue());
        }
        
    }
    //todo Finding No of unique element in the arr;

    public static void unique(int[] arr){   // arr[] = 4, 5, 3, 2, 1;
        // Declaring the hashmap;
      HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< arr.length; i++){
            map.put(arr[i], i);
        }
        // for(Map.Entry<Integer, Integer> e: map.entrySet()){
        //     System.out.println(e.getKey() + " ---> " + e.getValue());
        // }
         System.out.println(map.size());
    }
     
    //todo Find the first repeating element;

    public static void firstRepeating(int[] arr){   // arr[] = 4, 5, 3, 2, 1;
        // Declaring the hashmap;
    //   HashMap<Integer, Integer> map = new HashMap<>();
        int[] freq = new int[5];
        for(int i=0; i< freq.length; i++){
            freq[i] =0;
        }
        for(int i=0; i< arr.length; i++){
            freq[arr[i]]++;
            if(freq[arr[i]] > 1){
                System.out.println(arr[i]);
                return;
            } 
        }
        // for(Map.Entry<Integer, Integer> e: map.entrySet()){
        //     System.out.println(e.getKey() + " ---> " + e.getValue());
        // }
        //  System.out.println(map.size());
    }
    // //todo Another method for finding the  first repeating;

    // public static void firstRepeating1(int[] arr){   // arr[] = 4, 5, 3, 2, 1;
    //     // Declaring the hashmap;
    //   HashMap<Integer, Integer> map = new HashMap<>();
    //     // int[] freq = new int[5];
    //     for(int i=0; i< freq.length; i++){
    //         // freq[i] =0;
    //     }
    //     for(int i=0; i< arr.length; i++){
    //         int count =0;
    //        map(arr[i] , count++);
    //         if(map[arr[i]] > 1){
    //             System.out.println(arr[i]);
    //             return;
    //         } 
    //     }
    // }
    //todo Checking if two Strings are anagram;
    public static void anagram(String s1 , String s2){
        HashMap <Character , Integer > ag = new HashMap<>();
        HashMap <Character , Integer > ag1 = new HashMap<>();
       s1 = s1.toLowerCase();
       s2 = s2.toLowerCase();
        if(s1.length() != s2.length()){
            System.out.println("Strings are not anagram");
        }
       for(char val: s1.toCharArray()){
             ag.put(val, ag.getOrDefault(val, 0) +1);
       }
       for(char val: s2.toCharArray()){
             ag1.put(val, ag1.getOrDefault(val, 0) +1);
       }
        if(ag.equals(ag1)){
            System.out.println("Yes strings are anagram");
        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 4, 1 };
        // map(array);
        // unique(array);
        // firstRepeating(array);
        String s1 = "silent";
        String s2 = "listeN";
        anagram(s1, s2);
    }
}
