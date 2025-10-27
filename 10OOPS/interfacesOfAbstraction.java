public class interfacesOfAbstraction {
    public static void main(String[] args) {
        // rook r = new rook();
        // r.moves();
        bear b1 = new bear();
        b1.eat1();
    }
}

interface ChessPlayer{
    void moves();// by default abstract and public and can not write its implementation
}

class queen implements ChessPlayer{
   public void moves(){ // have to write public because above it is bydefault in public in interface so need to match 
  System.out.println(" up , down , right ,left , diagonal ");
    }
}
class rook implements ChessPlayer{
   public void moves(){ // have to write public because above it is bydefault in public in interface so need to match 
  System.out.println(" up , down , right ,left ");
    }
}
class pawn implements ChessPlayer{
   public void moves(){ // have to write public because above it is bydefault in public in interface so need to match 
  System.out.println(" up , 1step");
    }
}
class Bishop implements ChessPlayer{
   public void moves(){ // have to write public because above it is bydefault in public in interface so need to match 
  System.out.println("diagonal ");
    }
}

interface herbivoras{
void eat1();
}

interface carnivoras{
void eat2();
}

class bear implements herbivoras, carnivoras{
public void eat2(){
     System.out.println("bear eat meat");
}
public void eat1(){
     System.out.println("bear eat plant food");
}
}