package javaCorePractics.practics06;

public class Vehicle {
    //private variables
    private String make;
    private String model;
    private int year;

    //Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //Getter and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Instance Methods
    public void start() {
        System.out.println("Starting");
    }

    public void stop() {
        System.out.println("Stopping");
    }
}
