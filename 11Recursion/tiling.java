public class tiling {
    public static int tiles(int n){
        if (n==1 || n==0){
            return 1;
        }
        return tiles(n-1)+ tiles(n-2);  // phle tiles(n-1) call hota rahega base case pahuchne tak uske baad me tiles(n-2) chlta raheaga base case tak pahuchne tak.
            }
            public static void main(String[] args) {
                System.out.println(tiles(7));
            }
}
