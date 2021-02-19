package javaCorePractics.practics06;

public class Box {
    //Variables
    private int length;
    private int width;

    //Constructor
    public Box(int l, int w) {
        this.length = l;
        this.width = w;
    }

    //Display box name
    public void displayBoxName() {
        System.out.println("I am parent box class");
    }
}
