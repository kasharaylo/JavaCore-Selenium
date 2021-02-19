package javaCorePractics.practics10;

public class Ford implements Vehicle {

    @Override
    public void start(){
        System.out.println("Starting");
    }

    @Override
    public void stop(){
        System.out.println("Stopping");
    }

    @Override
    public void cruise(){
        System.out.println("Cruising");
    }

    public static void main (String args[]){
        Ford car = new Ford();
        car.start();
        car.stop();
        car.cruise();
    }
}
