package javaCorePractics.practics02;

public class Practics02Class04 {
    public static void main (String args[]) {
        String[] studentNames;
        int[] ages;

        studentNames = new String[] {"Kevin" , "Billy" , "Justin"};
        ages = new int[] {18, 25, 36};
        int[] score = new int[] {100, 200, 300};

        System.out.println(studentNames[1]);
        System.out.println(ages[2]);
        System.out.println(score[2]);
        ///
        for (int x = 1; x < 10; x++) {
            System.out.println("This number is: " + x);
        }

        ///
        String[] studentScore2 = {"Bob", "Kevin", "Marcus", "Billy"};
        for (String name : studentScore2) {
            System.out.println("Name is " + name);
        }

        int[] studentAges2 = {10, 20, 30, 40, 50};
        for (int c : studentAges2) {
            System.out.println("Ages is " + c);
        }
        ///
        int y = 5;
        while (y >= 0) {
            System.out.println("Number is: " + y);
            y--;
        }
        ///
        int z = 5;
        do {
            System.out.println("It's number: " + z);
            z--;
        } while (z >= 0);
    }
}
