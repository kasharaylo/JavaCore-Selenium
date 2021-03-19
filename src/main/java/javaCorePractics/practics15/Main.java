package javaCorePractics.practics15;

public class Main {

    public static void main (String args[]) {
        Person person1 = new Person();
        Person person2 = new Person();

        // Singleton
        // different cell of object
        System.out.println(person1);
        System.out.println(person2);

        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // the same cell of object
        System.out.println(s);
        System.out.println(s2);

        //Old fashion way to create object
        User Kevin = new User("Kevin", "New York", "Calkin");

        //Creating object with builder
        User Stepan = User.Builder.newInstance()
                .setName("Stepan")
                .setLastName("Ivanov")
                .setAddress("Los Angeles").build();

        System.out.println(Kevin);
        System.out.println(Stepan);

        //Factory
        ShapeFactory factory = new ShapeFactory();

        Square shape1 = (Square)ShapeFactory.createShape("square");
        shape1.draw();

        //OR

        Shape shape2 = ShapeFactory.createShape("circle");
        shape2.draw();

        Shape shape3 = ShapeFactory.createShape("rectangle");
        shape3.draw();
    }
}
