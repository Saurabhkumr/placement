package oops;

import com.sun.tools.javac.Main;

class Human{
    public String name ;
    public int age;
    static long population;
    public Human(String name , int age){
        this.name = name;
        this.age=age;
        population+=1;
    }
}
public class Oops2 {

    static int a =10;
    static  int b;
    int c=90;

    static {
        System.out.println("hello");
        b=2;
    }
    public static void main(String[] args) {
//        Human h1 = new Human("Saurabh",22);
//        Human h2 = new Human("anmol",24);
//        System.out.println(Human.population);
//        System.out.println(Oops2.b);
//        Oops2 m = new Oops2();
//        m.hello();
        System.out.println(b);
        System.out.println();


    }
//    public void hello() {
//        System.out.println("hello");
//    }

}

