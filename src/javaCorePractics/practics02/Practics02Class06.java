package javaCorePractics.practics02;

public class Practics02Class06 {
    public static void main (String[] args) {

        String[] celebrities = {"Ross", "Chandler", "Joye", "Philby", "Monica", "Rachel"};
        for (String name:celebrities) {
            System.out.print(name);
            System.out.print(",");
        }

        System.out.print("\n");

        int[] age = {25, 33, 32, 30, 45, 44};
        for (int i: age) {
            System.out.print(i);
            System.out.print(",");
        }

        String name = "Kevin";
        int ages = 45;
        String country = "USA";
        String state = "New York";
        String city = "New Jersey";

        System.out.println(",");
        System.out.println(String.format("His name is: %s, age: %d, country: %s, state: %s, city: %s" , name, ages, country, state, city));
    }
}
