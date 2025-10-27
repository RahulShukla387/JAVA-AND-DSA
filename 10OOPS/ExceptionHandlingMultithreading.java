
 class ExceptionHandlingMultithreadingCode extends Thread {
   private int n;
   private int d;
   public ExceptionHandlingMultithreadingCode(int n, int d, String name ){  
       super(name); 
       this.d = d;
       this.n = n;
    }
     public void run(){
        try{
            System.out.println(getName() + "program started..." );
            int result = n/d;
            System.out.println(getName() + "Result" + result );
        }
        catch (ArithmeticException e){
            System.out.println(getName() + e);
        }
        finally {
            System.out.println(getName() + "execution finished \n");
        }
     }
}



public class ExceptionHandlingMultithreading {
     public static void main(String[] args) {
     ExceptionHandlingMultithreadingCode t1 = new ExceptionHandlingMultithreadingCode(58 , 2, "Thread1");
     ExceptionHandlingMultithreadingCode t2 = new ExceptionHandlingMultithreadingCode(45 , 0, "Thread2");
     t1.start();
     t2.start();
    }
}
