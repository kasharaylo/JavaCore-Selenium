package javaCorePractics.practics02;

public class Practics02Class03 {
    public static void main (String[] args) {
        double grade = 0.05; // &&

        if (grade >= 5.0) {
            System.out.println("Awesome!");
        } else if (grade >= 4.1 && grade <= 4.9) {
            System.out.println("Good");
        } else if (grade >= 3.1 && grade <= 4.0 ) {
            System.out.println("Okay");
        } else if (grade >= 2.1 && grade <= 3.0 ) {
            System.out.println("Bad");
        } else if (grade >= 1.1 && grade <= 0.1 ) {
            System.out.println("Not okay!");
        } else {
            System.out.println("Too bad!");
        }

        double balance = 10000000; // OR
        int age = 30;

        if (balance == 100500 || age == 30) {
            System.out.println("Awesome!");
        } else {
            System.out.println("Good");
        }
    }
}
