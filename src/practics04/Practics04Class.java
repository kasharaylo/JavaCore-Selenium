package practics04;

public class Practics04Class {
    public static void main (String args[]) {
        name_of_dog("Max");
        bark();
        sleep();
    }

    //Static method
    public static void name_of_dog (String name) {
        System.out.println("My name is: " + name);
    }

    //Static method
    public static void bark () {
        System.out.println("I'm barking");
    }

    //non-Static method
    public static void sleep () {
        System.out.println("I'm sleeping");
    }
}
