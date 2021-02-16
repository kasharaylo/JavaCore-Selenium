package practics06;

public class Polymorphism {
    public static void main(String args[]){
        //Create object from Parent class
        Vehicle v1 = new Vehicle("Ford", "F150", 2012);
        v1.start();
        v1.stop();

        //Create SUV object
        SUV toyota = new SUV("Toyota", "RAV4", 2015);
        System.out.println("------------------------------------------------------");
        toyota.start();
        toyota.stop();

        //Create Semi object
        Semi volvo = new Semi("Volvo", "VML", 2010);
        System.out.println("------------------------------------------------------");
        volvo.start();
        volvo.stop();

        //Create Motorbike object
        Motorbike harley = new Motorbike("Harley", "Samson", 2016);
        System.out.println("------------------------------------------------------");
        harley.start();
        harley.stop();
    }
}
