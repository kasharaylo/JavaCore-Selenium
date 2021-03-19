package javaCorePractics.practics16;

public class DriverRunner {
    public static void main(String[] args) {

        Driver d1 = new Driver("Ivan", 2456, true);
        Driver d2 = new Driver("Ivan", 2456, true);

        boolean result = d1.equals(d2);
        boolean result2 = d1 == d2;

        System.out.println(result);
        System.out.println(result2);

        System.out.println(d1.hashCode());
        System.out.println(d1.equals(d2));
    }

}
