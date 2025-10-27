public class Practice {
    public static void power(int n){
        int answer =1;
        int base = n;
        while(n>0){
            if((n&1) !=0){
            answer = answer*base;
            }
           base = base*base;
          n=  n>>1;
        }
        System.out.println(answer);
    }
    public static void swap(int a, int b){
        a = b-a;   // ex  let a = 5 b = 2  => a = 2-5 = -3
        b = b-a; // b = 2 -(-3) => 5(a) // hence b get value of a 
        a = b+a;  // a => 5 + -3 = 2(b);   Hence both values get swapped
        System.out.println("The swapped value of a and b is " + a + " ," + b);
    }

    public static void main(String[] args) {
        int n =6 , p =8;
        // power(n);
        swap(n, p);
    }
}
