public class staticKeyword {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Rahul";
        s1.rollNo = 21;
        s1.schname = "Aims inter college";
        System.out.println(s1.stclass(10));
        student s2 = new student();
        s2.name = "Mahesh";
        // here we did not print the school name of s2 still it will take from s1.
        System.out.println(s2.schname);
    //   System.out.println(s2.stclass(12));  
    }
}
class student{
    String name;
    int rollNo;
    // static in property
    static String schname;
    // static in function
    static int stclass (int stclass){
        return stclass;
    }
}