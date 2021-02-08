package practics04;

public class Automobile {
    String make;
    String model;
    int year;

    //Constructor
    public Automobile(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

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

    /*
    //Getters method
    public String getMake() {return make;}
    public String getModel() {return model;}
    public int getYear() {return year;}

    //Setters method
    public void setMake(String make) {this.make = make;}
    public void setModel(String model) {this.model = model;}
    public void setYear(int year) {this.year = year;}
    */

    //Default constructor
    public void start () {
        System.out.println("Starting");
    }
}
