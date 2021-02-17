package practics07.factory;

public class Main {
    public static void main(String[] args) {

        //ShapeFactory factory = new ShapeFactory();

        Shape shape1 = ShapeFactory.createShape("square");
        shape1.draw();

        Shape shape2 = ShapeFactory.createShape("circle");
        shape2.draw();

        Shape shape3 = ShapeFactory.createShape("rectangle");
        shape3.draw();
    }
}
