public class Practice {
    public static void FindingNoInPivotedArray(int array[], int target){
        int n = (int)(Math.random()*array.length);
        System.out.println(n);
        int[] list = new int[array.length];
        for(int i= 0; i<array.length; i++){
            list[i] = array[i];
            if( n+i<array.length){
            array[i] = array[n+i];
            // array[array.length-i-1] = array[i];
            }
         }
         for(int i=0; i<array.length; i++){
            if(i<n){
            array[array.length-i-1] = list[n-i-1];
            }
         }
        System.out.println("randon no is " + n);
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " \t");
        }
       
            int max = array.length-n-1;
            int min = 0;
            while(min<=max){
                 int mid = (min+max)/2;
                 if(array[mid]==target){
                    System.out.println("your integer is at index  " + mid);
                    return;
                 }
                 else{
                 if(array[mid]>target){
                      max = mid-1;
                 }
                 else{
                    min = mid +1;
                 }
                }
            }
            int min2 = array.length-n;
            int max2 = array.length-1;
            while(min2<=max2){
                 int mid2 = (min2+max2)/2;
                 if(array[mid2]==target){
                    System.out.println("your integer is at index  " + mid2);
                    return;
                 }
                 else{
                 if(array[mid2]>target){
                      max2 = mid2-1;
                 }
                 else{
                    min2 = mid2 +1;
                 }
                }
            }
        
    }

    // if pivoted array is given 
    public static void find(int array[], int list[], int target){
        int min = 0;
        int index = 0;
        int max = array.length-1;
        while (min<=max) {
            int mid = (min +max)/2;
            if(array[mid] == list[0]){
                System.out.println("pivot index is  " + mid );
                index +=mid;
                break;
            }
            else{
                if(array[mid]>list[0]){
                    max = mid-1;
                }
                else{
                    min = mid+1;
                }
            }
        }
        int max1 = array.length-index-1;
        int min1 = 0;
        while(min1<=max1){
            int mid1 = (min1 + max1)/2;
            if(list[mid1]== target){
                 System.out.println("In pivoted array , your no is at index " + mid1);
                 return;
            }
            else{
                if(list[mid1]>target){
                    max1 = mid1-1;
                }
                else{
                    min1 = mid1+1;
                }
            }
        }
        int max2 =array.length-1;
        int min2 = array.length-index;
        while(min2<=max2){
            int mid2 = (min2 + max2)/2;
            if(list[mid2]== target){
                 System.out.println("In pivoted array , your no is at index " + mid2);
                 return;
            }
            else{
                if(list[mid2]>target){
                    max2 = mid2-1;
                }
                else{
                    min2 = mid2+1;
                }
            }
        }     
    }
    // Finding the triplet in the given array condition is index should be distinct and num[i] + num[j]+ num[k] == 0;
    // example: => Input:nums = [-1, 0,  1, 2, -1, -4]   Output:   [ [-1, -1, 2] , [-1, 0, 1] ]
    public static void findTriplet(int array[]){
        int[] triplet = new int[3];
        for(int i = 0; i<array.length; i++){
            for(int j= i+1; j< array.length; j++){
                for(int k=j+1; k<array.length; k++){
                    if(array[i]+array[j] + array[k] == 0){
                        triplet[0] = array[i];
                        triplet[1] = array[j];
                        triplet[2] = array[k];
            System.out.format("( %d, %d, %d )", triplet[0], triplet[1], triplet[2]);

                    }
                }
            }
        }
    }
    public static void main(String args[]){
          int array[] = { 4, 5, 7,8, 9, 10};
          int PivotedArray[] = { 9, 10, 4, 5, 7, 8};
          int triplet[] ={-1, 0,  1, 2, -1, -4};
          findTriplet(triplet);
          // FindingNoInPivotedArray(array, 9);
         // find(array, PivotedArray, 8);
    }
}
