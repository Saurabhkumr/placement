class HelloWorld {

    HelloWorld()
    {
        System.out.println("constructor");
    }
    static HelloWorld h1= new HelloWorld();


    int getk()
    {   int k=5;
        System.out.println("this is "+k);
        return k;
    }

    public static void main(String[] args) {

        HelloWorld h2 = new HelloWorld();
        System.out.println("h2" + h2.getk());
        System.out.println("h1" + h1.getk());
        System.out.println("h1+h2 " + h2.h1.getk());
        //System.out.println("method"+getk());
    }
}