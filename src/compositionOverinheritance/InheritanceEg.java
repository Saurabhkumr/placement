package compositionOverinheritance;

// Superclass
class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("Vehicle starting...");
    }

    public void stop() {
        System.out.println("Vehicle stopping...");
    }

    // Getters and setters
}

// Subclass inheriting from Vehicle
class Car extends Vehicle {
    private int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    // Additional methods specific to Car
    public void drive() {
        System.out.println("Car is driving...");
    }
}

public class InheritanceEg {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2020, 4);
        myCar.start();  // Inherited method from Vehicle
        myCar.drive();  // Method specific to Car
        myCar.stop();   // Inherited method from Vehicle
    }
}
