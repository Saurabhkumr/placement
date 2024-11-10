 abstract class Test1 {
    public abstract void display();  // Abstract method
}

class MyTest extends Test1 {
    public void display() {
        System.out.println("This is MyTest.");
    }
}

class AnotherTest extends Test1 {
    public void display() {
        System.out.println("This is AnotherTest.");
    }
}

public class Test {
    public static void main(String[] args) {
        Test1 t1 = new MyTest();   // t1 refers to a MyTest object
        t1.display();            // Output: This is MyTest.

        t1 = new AnotherTest();  // t1 now refers to an AnotherTest object
        t1.display();            // Output: This is AnotherTest.
    }
}
