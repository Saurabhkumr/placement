package moocify;

public class Fitbyte {

    private int age;
    private int restingHeartRate;
    private double maximumheartrate;
    public Fitbyte(int age, int restingHeartRate){
        this.age=age;
        this.restingHeartRate=restingHeartRate;
        this.maximumheartrate=206.3 - (0.711 * this.age);
    }
    public double targetHeartRate(double percentageOfMaximum){
        return (maximumheartrate - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
    }
}
