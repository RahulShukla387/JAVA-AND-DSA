public class abstractfnofAbstraction  {
    public static void main(String[] args) {
     //   animal a = new animal(); //todo you cannot make a object class of abstruct class.
     horse h =new horse();  //todo if i directly run it without doing anything then first constructor of base class called then after constructor of derived class called.
    //  h.eat("grass");
    // System.out.println(h.name); // same name will print which given in the constructor of animal untill you did not give any name to horse.
       }
}
 abstract class  animal {
 String name ;
 abstract void eat(String food);// abstract function can not we define means can not sout something .
    animal(){
       name = "This is animal";
       System.out.println("Hi i am animal");
    }
}
class horse extends animal{
    void eat(String food){  // in all extends classes you must have a copy of main class.
       System.out.println("Horse eat " + food);
    }
    // // to assign the value of the animal we need to make a constructor.
     horse(){
        name = "ghoda";
        System.out.println("Hi i am horse");
     }
    int run(){
        return 4;
    }
}
