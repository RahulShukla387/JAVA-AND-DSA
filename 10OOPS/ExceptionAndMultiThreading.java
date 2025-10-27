
class NumberDivider extends Thread {  //todo Thread is inbuilt fn in which getName() function are present.
    private int numerator;
    private int denominator;

    public NumberDivider(int numerator, int denominator, String name) {
        super(name); // Thread name  //todo whatever name i will give it will pass that to the inbuilt Thread
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " started...");
            int result = numerator / denominator; // May cause exception
            System.out.println(getName() + " Result: " + result);
        } catch (ArithmeticException e) { //todo rather than just right e also have to define types of error.
            System.out.println(getName() + " Exception: Division by zero is not allowed!");
        } finally {
            System.out.println(getName() + " finished execution.\n");
        }
    }
}
/*
 * 🔎 Why is it a constructor?

Same name as the class → The class is NumberDivider, and the method’s name is also NumberDivider.
In Java, a constructor must have the same name as the class.

No return type → Functions (methods) in Java must declare a return type (void, int, String, etc.).
A constructor has no return type, not even void.

Called automatically when object is created →
When we write:

NumberDivider t1 = new NumberDivider(10, 2, "Thread-1");


Java automatically calls this constructor to initialize the object.

🔎 What happens inside?

super(name);
Calls the constructor of the parent class Thread, passing the thread name.
So Thread knows its name is "Thread-1".

this.numerator = numerator;
Assigns the value to the object’s field.

this.denominator = denominator;
Same for denominator.

//todo
Exactly right, Rahul 👌
Yes — the start() function we are calling in main is an inbuilt method of the Thread class in Java.

🔎 How it works

In my program we did:

t1.start();
t2.start();
t3.start();


Here, t1, t2, and t3 are objects of NumberDivider, which extends Thread.
So they inherit the start() method from the Thread class.

🛠 What does start() actually do?

It tells the JVM to create a new thread of execution.

It internally calls the native OS thread scheduler to start a new lightweight process.

It calls the run() method, but on a new thread.

If you directly call run(), it will run like a normal function (on the main thread).

But if you call start(), the JVM runs run() in parallel, on a new thread.
//todo
if there is multiple function in MyThread like run(), drive(), see() then to which function start will call out ?
ChatGPT said:

Beautiful doubt, Rahul 👍 This is where many students get confused, so let’s clear it properly.

🛠 Suppose we have this code:
class MyThread extends Thread {
    public void run() {
        System.out.println("Inside run() method");
    }

    public void drive() {
        System.out.println("Inside drive() method");
    }

    public void see() {
        System.out.println("Inside see() method");
    }
}


And in main:

public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();   // starting a new thread
    }
}

🔎 Which method will start() call?

The start() method is defined in Thread class (inbuilt).

It internally calls only run() of your thread object, not any other method.

So in the above example, only run() will be executed when start() is called.

🚫 Important

drive() and see() are just normal methods.

If you want to execute them, you must call them manually:

t1.drive();
t1.see();


They will run like normal function calls in the same thread where you call them.

 */
public class ExceptionAndMultiThreading {
       // Creating multiple threads with different inputs
        NumberDivider t1 = new NumberDivider(10, 2, "Thread-1"); // No exception
        NumberDivider t2 = new NumberDivider(15, 0, "Thread-2"); // Will throw exception
        NumberDivider t3 = new NumberDivider(20, 4, "Thread-3"); // No exception

        // Starting threads
        t1.start();
        t2.start();
        t3.start();

        // Main thread message
        System.out.println("Main thread execution completed.");
}
