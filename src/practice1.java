class Car{
    private int wheel=4;

    public int getWheel(Car obj) {
        return obj.wheel;
    }
}

public class practice1 {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.getWheel(c));
    }
}
