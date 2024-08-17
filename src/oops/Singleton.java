package oops;

 class SingletonClass{
   private SingletonClass(){
       System.out.println("hey");
   };
   public static SingletonClass instance;
   public static SingletonClass getInstance(){
       if(instance==null){
           instance=new SingletonClass();
       }
       return instance;
   }
}

public class Singleton {
    public static void main(String[] args) {
      SingletonClass s1 = SingletonClass.getInstance();
      SingletonClass s2 = SingletonClass.getInstance();
        System.out.println(s1==s2);


    }
}
