package oops.oops4Abstraction;

public class Daughter extends Parent {

    public Daughter(int age){
        this.age=age;
    }
    @Override
    void career( ) {
        System.out.println("i am going to be pilot");
    }

    @Override
    void partner() {
        System.out.println(" name of partner abc");
    }

}
