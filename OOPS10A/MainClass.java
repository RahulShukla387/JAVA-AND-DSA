package OOPS10A;

public class MainClass {
    public static void main(String[] args) {
       
        Student s;  // declare refrence
        s = new Student(); // actual obj created in heap.
       s.setStudent(67, "Rahul", 98);
       s.showStudent();
    }
}
