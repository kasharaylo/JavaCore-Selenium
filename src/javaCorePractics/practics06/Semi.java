package javaCorePractics.practics06;

public class Semi extends Vehicle {

    //Constructor
    public Semi(String make, String model, int year) {
        super(make, model, year);
    }

    public void start() {
        System.out.println(String.format("%s %s %d starting", getMake(), getModel(), getYear()));
    }
    public void stop() {
        System.out.println(String.format("%s %s %d stopping", getMake(), getModel(), getYear()));
    }
}