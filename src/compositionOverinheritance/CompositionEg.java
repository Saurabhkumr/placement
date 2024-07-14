package compositionOverinheritance;

// Component class
class Engine {
    public void start() {
        System.out.println("Engine starting...");
    }

    public void stop() {
        System.out.println("Engine stopping...");
    }
}

// Component class
class Wheel {
    private int size;

    public Wheel(int size) {
        this.size = size;
    }

    // Methods related to wheel functionality
    public void rotate() {
        System.out.println("Wheel rotating..."+this.size);
    }
}

// Composite class
class VehicleComp {
    private Engine engine;
    private Wheel wheels;

    public VehicleComp(Engine engine, Wheel wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void drive() {
            wheels.rotate();

        System.out.println("Vehicle is driving...");
    }
}

public class CompositionEg {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Wheel wheels =  new Wheel(18);
        VehicleComp myCar = new VehicleComp(engine, wheels);

        myCar.start();  // Uses Engine start method
        myCar.drive();  // Uses Wheel rotate method
        myCar.stop();   // Uses Engine stop method
    }
}
