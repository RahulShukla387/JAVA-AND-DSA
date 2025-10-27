  
public class inheritence {
  public static void main(String[] args) {
    birds b1 = new birds();
    // b1.eat();  // inherit the property from animal
    bats bat1 = new bats();
   bat1.night();
//    bat1.eat();
vampire v1 = new vampire();
v1.night(); // called the night function of vampire
  }  
}

 class Animal{
    void sound(){
        System.out.println("making sound");
    }
    void eat(){
        System.out.println("Eating");
    }
 }
class birds extends Animal{  // after using extend sound and eat function come in birds class
   void fly(){
    System.out.println("flying in the sky");
   }
}
class bats extends birds{  // second inheritance i.e multiple inheritence
   void night(){
      System.out.println("bat is a bird which fly in night");
    }
}
class vampire extends birds{  // example of hierarchial class.
    void size(){
        System.out.println("bigger than bat");
    }

    void night(){  // ex. of method overriding
        System.out.println("mainly in night");
    }
}