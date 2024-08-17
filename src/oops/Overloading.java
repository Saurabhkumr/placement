package oops;

class Abc{

    public void hello(int... n){
        System.out.println("hello varargs "+n.toString());
    }
    public void hello(Integer n){
        System.out.println("hello Integer "+n);
    }
    public void hello(int n){
        System.out.println("hello one int  "+n);
    }
    public void hello(int n,int m){
        System.out.println("hello two int "+n+" "+m);
    }
    public void hello(String n){
        System.out.println("hello string "+n);
    }
}

public class Overloading {
    public static void main(String[] args) {

        Abc a1 = new Abc();
        int[] arr = {1,2,3,4};
        a1.hello(2);
        a1.hello(2,3);
        a1.hello(2,3,4,5);
        a1.hello(arr);

    }
}
