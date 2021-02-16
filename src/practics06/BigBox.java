package practics06;

public class BigBox extends Box {

    //Variables
    private int length;
    private int width;
    private int height;

    //Constructor
    public BigBox (int l, int w, int h){
        super(l,w);
        this.length = l;
        this.width = w;
        this.height = h;
    }

    //Display box name
    public void displayBoxName() {
        System.out.println("I am big box class");
    }

    //Display area
    public void printArea() {
        double area = length * width * height;
        System.out.println("Area is: " + area);
    }
}
