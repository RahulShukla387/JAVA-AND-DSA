public class firstOccurenceAndLastOccurence {
    public static int firstOccurence(int array[], int i , int target){
        if (i==array.length){
          return 0;
        }
      if (array[i] ==target){
          return i;
      }
      return firstOccurence(array, i+1, target);
  }
  public static int lastOccurence(int array[], int last , int target){
    if(last == 0){
        return 0;
    }
   if(array[last]== target){
    System.out.println("The last occurence of element is at index  ");
    return last;
   }
   return lastOccurence(array, last-1, target);

  }
  public static int nthPower(int n , int power){
    // if(power == 0){
    //     return 1;
    // }
    // can we write 
    if (power ==1){
      return n;
    }
    
   return n*nthPower(n, power-1);
  }
  public static int nthPower1(int n,int power){
    if(power==0){
      return 1;
    }
      int halfpower = nthPower(n, power/2);
     int halfpowersq = (int)Math.pow(halfpower, 2);
     if(power%2!=0){
      halfpower = n*halfpower;
     }
     return halfpowersq;
  }
  public static void main(String[] args) {
      int array[] = {2, 4, 3, 6,3,2, 5};
    //  System.out.println(firstOccurence(array , 0, 2)); 
    //  System.out.println(lastOccurence(array , array.length-1, 3)); 
    System.out.println(nthPower1(2, 4));
  }
}

