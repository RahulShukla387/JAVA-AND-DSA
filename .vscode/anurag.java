public class anurag {
    public static void main(String[] args) {
        int count =1 , maxcount =0;
        int array[] = {1, 1, 1, 1, 1,0,0,0,1};
     for(int i=1; i<array.length;i++){
      if(array[i] == array[i-1]){
            count++;
      }
      else{
        maxcount = Math.max(count, maxcount);
    count =1;
      }
     }
     System.out.println(maxcount);
    }
}
