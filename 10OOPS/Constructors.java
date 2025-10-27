// incapsulation means to write the code in proper manner capsule every property like if something is very important use private .

public class Constructors {
    public static void main(String[] args) {
      student s1 = new student(10);
      s1.name = "Rahul";
      s1.stclass = 12;
      s1.marks[0] = 99;
      s1.marks[1] = 90;
      s1.marks[2] = 95;
      // s1.marks[3] = 97;  //todo it will not get printed as limit given three
      // System.out.println(s1.rollNo);
     student s2 = new student(s1);
     // s1.marks[0] = 100;  marks will get changes in s2 also if we shallow constructor.
     s1.marks[0] = 100; // this changes doesnot reflect in the s2 if it is deep constructor.
     for(int i=0; i<4; i++){
      System.out.println(s2.marks[i]);
     }
    }
}
 class student {
  String name;
   int rollNo;
   int stclass; 
   int marks[];
    // constructors 
   student (){    //todo non parametrized constr.
   marks = new int[3];
   }
   student(int rN){ //todo paramatrized const. // this is the constructor if you did not make constructor java autometically will define a constructor for itself
      this.rollNo = rN;
      marks = new int[3];
   }
   //todo copy constructor 
   student(student s1){
      this.name =s1.name;  // the property which want to copy in s2 from s1;
      this.rollNo = s1.rollNo;  
      this.stclass = s1.stclass;
      marks = new int[3]; // it define that all the object created can only store three subject marks.
      //  this.marks = s1.marks; // shallow constructor  // It will pass reference copy of s1 into other object (means if changes in s1.then other will also get changed) if you did not use loop and directly use this.marks = s1.marks instead of this.marks = s1.marks[i] (i from 0 to 2)
     for (int i=0; i<marks.length; i++){
      this.marks[i] = s1.marks[i];
     }
   }
}
