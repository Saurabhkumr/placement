package oops;

public class ExceptionHandling {
    public static void main(String[] args) {
        int result = divide(3,0);


    }
   public  static int divide(int a , int b)throws ArithmeticException{
        if(b==0)throw new ArithmeticException("divide by 0");
        return a/b;
    }
}
