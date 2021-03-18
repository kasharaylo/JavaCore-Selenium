package homeWork.homeWork06;

public class Triangle {
    int a, b, c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    //TO-DO add calculation
/*    public calculatePerimeter(int perimeter) {
        int perimeter = a + b + c;
    }*/

    //Singleton
    private static Triangle instance;

    public static Triangle getInstance() {
        if (instance == null) {
            return instance = new Triangle();
        }
        return instance;
    }
}
