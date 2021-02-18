package practics11;

import java.util.Vector;

public class VectorExample {
    public static void main (String args[]){
        Vector vector1 = new Vector();
        vector1.add(10);
        vector1.add(20);
        vector1.add(30);
        System.out.println("Vector1 is: " +vector1);
        System.out.println("Vector1 value is: " + String.valueOf(vector1.size()));
        vector1.remove(1);
        System.out.println("Vector1 is: " +vector1);
        System.out.println("Vector1 value is: " + String.valueOf(vector1.size()));

        Vector vector2 = new Vector(2);
        vector2.add(40);
        vector2.add(50);
        vector2.add(60);
        System.out.println("Vector2 is: " +vector2);
        System.out.println("Vector2 value is: " + String.valueOf(vector2.size()));
        vector2.remove(0);
        System.out.println("Vector2 is: " +vector2);
        System.out.println("Vector2 value is: " + String.valueOf(vector2.size()));
    }
}
