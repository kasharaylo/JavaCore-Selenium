package javaCorePractics.practics06;

public class SmallBox extends Box {

    //Variables
    private int length;
    private int width;

    //Constructor
    public SmallBox (int l, int w){
        super(l,w);
        this.length = l;
        this.width = w;
    }

    //Display box name
    public void displayBoxName() {
        System.out.println("I am small box class");
    }

    //Display area
    public void printArea() {
        double area = length * width;
        System.out.println("Area is: " + area);
    }
}
