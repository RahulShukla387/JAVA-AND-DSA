
public class basic {
    public static void main (String args[]){
    pen p = new pen();
      p.brandname = "Elkos"; // because brandname is default we can directly acces it , but you can access a function for it from class pen;
       p.putcost(5);
     //  p.getcost();
       System.out.println(p.getcost());
      //p.costs = 5; you can not acces because int is private
    }
    }
class pen{
    String brandname;
  private  int costs;
  void putcost(int cost){
    this.costs = cost;
  }
  int getcost(){
    return costs;
  }
     String color;
}
