package oops.oops4Abstraction;

public class Son extends Parent{

    public Son(int age){
        this.age=age;
    }
    public void hello(){
        System.out.println("hello");
    }

    @Override
    void career() {
        System.out.println("i am going to be crickter");
    }

    @Override
    void partner() {
        System.out.println(" name of partner xyz");
    }

}
