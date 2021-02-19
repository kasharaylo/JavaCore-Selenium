package javaCorePractics.practics04;

public class AccessorMethodGetter {
    public static void main (String args[]) {
        //Creating of Toyota object
        Automobile toyota = new Automobile("Toyota", "RAV4", 2015);

        //Get the value
        System.out.println("Care make is: " +toyota.getMake());
        System.out.println("Care model is: " +toyota.getModel());
        System.out.println("Care year is: " +toyota.getYear());

        //Used setters to set a new value
        toyota.setMake("Toyota");
        toyota.setModel("Prius");
        toyota.setYear(2012);

        //Get the value again
        System.out.println("Care make is: " +toyota.getMake());
        System.out.println("Care model is: " +toyota.getModel());
        System.out.println("Care year is: " +toyota.getYear());

        //Starting
        toyota.start();
    }
}
