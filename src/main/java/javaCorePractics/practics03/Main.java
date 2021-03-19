package javaCorePractics.practics03;

public class Main {
    public static void main (String[] args) {

        // 1st object
        Student constantine = new Student();
        constantine.firstName = "Constantine";
        constantine.lastName = "Kasharaylo";
        constantine.age = 29;

        // 2nd object
        Student mary = new Student();
        mary.firstName = "Mary";
        mary.lastName = "Oleinik";
        mary.age = 28;

        // 1st object print methods
        constantine.printFirstName();
        constantine.printLastName();
        constantine.printAge();

        // 2nd object print methods
        mary.printFirstName();
        mary.printLastName();
        mary.printAge();

        // Overloaded methods
        constantine.printFirstName("Constantine text");
        mary.printFirstName("Mary text");

        constantine.printLastName("Kasharaylo text");
        mary.printLastName("Oleinik text");

        constantine.printAge("29 text");
        mary.printAge("28 text");

        // Call Method with Undefined objects
        constantine.typo("Hello " + 100, " Some text ", constantine);
        System.out.println("*********");
        mary.typo("Bye " + 200, " Other text ", mary);


        // 1st object
        boolean testResult = constantine.passTest("Math");
        boolean old = constantine.isOld(60);

        System.out.println(testResult);
        System.out.println(old);

        // 2nd object
        boolean testResult2 = mary.passTest("Physics");
        boolean old2 = mary.isOld(60);

        System.out.println(testResult2);
        System.out.println(old2);

    }
}
