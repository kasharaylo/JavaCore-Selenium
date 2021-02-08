package practics05;

public class Practics05Class02 {
    public static String name;
    public static final double PI = 3.14; //Constants
}

class ConstantsMethod {
    public static void main (String args[]) {
        Practics05Class02.name = "Constantine";
        //Practics05Class02.PI = 3.12; // Error
        System.out.println(Practics05Class02.name);
        System.out.println(Practics05Class02.PI);
    }
}