package practics07.factory;

public class ShapeFactory {

    public static Shape createShape(String shapeName) {

        if (shapeName.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else  if (shapeName.equalsIgnoreCase("SQUARE")) {
            return new Squire();
        } else  if (shapeName.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        throw  new IllegalArgumentException("Shape is not valid");
        //return null;
    }
}
