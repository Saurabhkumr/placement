package oops;

  class Box{
      public int l;
      public int w;
     Box(){
         this.l=-1;
         this.w=-1;
     }
     Box(int l , int w){
         this.l=l;
         this.w=w;
     }
     public void display(){
         System.out.println("i am Box");
     }

      public static void hello() {
          System.out.println("hello");
      }
  }
  class Cube extends  Box {
      int weight;
    Cube(int l , int w , int weight){
        super(l,w);
        this.weight=weight;
    }
        Cube(){
        this.weight=-1;
        }
    public  void display(){
        System.out.println("i am cube");
    }
      public static void hello() {
          System.out.println("hello from cube");
      }

  }


    public class Oops3 {
       public static void main(String[] args) {
           Box b = new Box(2,3);
           Box b1 = new Cube();
           Cube c = new Cube();
           c.display();
           b1.display();
           b.display();
           b1.hello();
           Cube.hello();


       }
   }


