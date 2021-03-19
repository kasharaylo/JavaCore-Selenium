package javaCorePractics.practics15;

public class ShapeFactory {
    public static Shape createShape(String shapeName) {

        if (shapeName == null || shapeName == "") {
            throw new IllegalArgumentException("ShapeFactory got null");
        }

        if(shapeName.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeName.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        throw new IllegalArgumentException("Shape doesn't recognized");
        //return null;
    }
}
