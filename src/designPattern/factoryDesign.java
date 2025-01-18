package designPattern;


import java.awt.*;

interface Shape{
    void display();
}

class Circle implements Shape{
    @Override
    public void display() {
        System.out.println("i am circle");
    }
}
class Rectangle implements Shape{
    @Override
    public void display() {
        System.out.println("i am rectangle");
    }
}
class Triangle implements Shape{
    @Override
    public void display() {
        System.out.println("i am triangle");
    }
}


class FactoryShape{
    public Shape getShape(String str){
        if(str.equals("circle"))return new Circle();
        else if (str.equals("rectangle"))return new Rectangle();
        else if (str.equals("triangle"))return new Triangle();
        return null;
    }
}


public class factoryDesign {
    public static void main(String[] args) {
//        Circle c = new Circle();
//        c.display();

        FactoryShape fs = new FactoryShape();
        Shape s1 = fs.getShape("circle");
        s1.display();
    }
}
