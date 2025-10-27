package OOPS10A;
//todo here it is vialatting the concept oops because of absence of encapsulation.
// class Student {
//   int roll;
//    String name;
//    double per;
// }
//todo creating encapsulation
class Student {
 private int roll;
 private  String name;
 private  double per;
 //now be need getter and setter for geting and seting the values.
  public void setStudent(int roll, String name, double percent){
    if(roll <=0){
      System.out.println("Rollno should be +ve");
      return;
    } 
    else this.roll = roll;
    this.name = name;
    this.per = percent;
  }
  public void showStudent(){
    System.out.println("Roll no \t" + roll);
    System.out.println("name \t" + name);
    System.out.println("Percentage \t" + per);
  }
}
//todo Abstractionn
// abstraction is the process of making things easy so that we only so that part to user which is required to him.