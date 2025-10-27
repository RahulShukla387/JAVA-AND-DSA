// public class CallMethods {
//       // simple int called by value
//     public static void check(int x){
//          x = 10;
//         System.out.println(x);
//     }
//     public static void main(String[] args) {
//         int x = 1;
//         check(x);
//         System.out.println("This is local " + x);  // this result proof that int is  Passed  by value 
//     }
//     }
      

    // Array always called by reference;

    public class CallMethods_1 {
    public static int subjectMarks (int marks[]){
        System.out.println("Array printing in the method");
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+5;
            System.out.print( "\t" +marks[i]);
        }
       return 0;        
    }
        public static void main(String[] args) {
           // marks out of 40
            int marks[]  = {22, 20, 30, 25, 21};
            subjectMarks(marks);
            for(int i=0; i<marks.length; i++){
                System.out.print( "\n" +marks[i] + " ");  // This result proof that array are passed by the refernce
            }
        }
    } 