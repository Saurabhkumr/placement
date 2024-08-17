package oops;


class A{
    public void show1(){
        System.out.println("i am show1");
    }

    public A(int m){
        System.out.println(m);
    }
}
class B extends A{
    public void show2(){
        System.out.println("i am show2");
    }
    public B(int n){
        super(n);
        System.out.println((n));
    }
}
public class Oops1 {
    public static void main(String[] args) {
        A obj = new B(10);
        B obj1 = new B(10);
        obj.show1();
    }
}
