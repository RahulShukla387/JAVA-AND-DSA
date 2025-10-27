  // index of repeating element in the sorted array. Time complexity O(n)
public class sorting {
    public static void sort(int array[]){
        int count =0 , k=0;
          for(int i=0;i<array.length; i++){
              count = i;
              k=i;
              while(i+1<array.length &&array[i]== array[i+1]){
                count++;
                i++;
              }
              System.out.println("Repeated element with index are  " + array[i]+"  (" + k +" ,"+ count + ")");
          }
    }
    // Trying to do time complexity O(logn)
    public static void sort1(int array[]){
        int min =0;
        int max = array.length-1;
        while (min<=max) {
            int mid = (min +max)/2;
           if(array[mid]== array[mid-1]){
            mid--;
           }
           else if(array[mid]== array[mid+1]){
            mid++;
           }
           else{
            min = mid+1;
            max = mid-1;
           }
        }
    }
    public static void main (String args[]){
    int inp[] = {4,4,4,5, 3,6, 6,6, 7 };
    sort(inp);
    }
}
