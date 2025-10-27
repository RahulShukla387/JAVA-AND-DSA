public class binarySearch_3 {
    // in the binary search array should be sorted 
    public static void binSearch(int array[] ,int target){
        int min = 0 , max = array.length-1;
           while(min<=max){
               int  mid = (min + max)/2;
             if(array[mid]== target){

                System.out.println("your item is at index  " + mid);
                return;
             }
             else{
                if(array[mid]>target){
                    max = mid-1;
                }
                else{
                    min = mid+1;
                }
             }
            }
                System.out.println("sorry no. not exist in the array");
        }
            public static void main(String[] args) {
                int array[] = {45,67, 89, 90, 95};
                int target= 8;
               binSearch(array, target);
            
        }
    }
   

