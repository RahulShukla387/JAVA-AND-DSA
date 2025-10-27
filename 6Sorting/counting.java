public class counting {
    public static void countingSort(int[] arr){
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
       for (int i=0; i< arr.length; i++){
        if(arr[i]> max){
            max = arr[i];
        }
        if(arr[i] < min){
            min = arr[i];
        }
       }
       System.out.println(max);
       System.out.println(min);
        int[] freq = new int[max-min +2];
               for(int i =0; i< arr.length; i++){
                freq[arr[i] - min]++;  // if i will add min it will also handle the negative numbers.
               }
                for(int i = 0 ; i< freq.length; i++){
                    System.out.print(freq[i] + "\t");
                }
                int count =0;
                 for(int i = 0; i< freq.length; i++){
                    while (freq[i]-- > 0) {
                        arr[count] = i + min;  // here also added min so that it handle properly the shifted negative no and we can again get original one.
                        count++;
                    }
                 }
                 System.out.println( " Sorted array are: \n");
                 for(int i= 0; i< arr.length; i++){
                    System.out.print(arr[i] + "\t");
                 }
    }  
    public static void main(String[] args) {
         int [] arr = {5, 1, 9, -6, 6, 10, -5, 5, 0, 7};
         countingSort(arr);
    }
}
