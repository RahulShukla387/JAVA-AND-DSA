import java.util.*;
// interface sea{
//    default void water(){
//         System.out.println("sea have water");
//     }
// }
// interface river extends sea{     // interface can extends another interface same like a class.
//     default void water(){
//         System.out.println("River also have water but fresh water");
//     }
// }
// class ganga implements river{

// }

//todo Without using default or static using interface 

interface Sea {
    void water();  // abstract method (by default)
}

interface River extends Sea {
    void freshWater();  // another abstract method
}

// Ganga must implement both water() and freshWater()
class Ganga implements River {
    public void water() {
        System.out.println("Sea has water");
    }

    public void freshWater() {
        System.out.println("River also has fresh water");
    }
}


public class Interface {
    public static void main(String[] args) {
         Ganga g = new Ganga();
         g.water();
         g.freshWater();
    }
}
