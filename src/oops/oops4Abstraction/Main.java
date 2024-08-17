package oops.oops4Abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(15);
        son.career();
        Daughter daughter = new Daughter(13);
        daughter.career();
        Parent p = new Son(22);
        p.normal();
        System.out.println(p.num);
        System.out.println(Parent.a);

    }
}
