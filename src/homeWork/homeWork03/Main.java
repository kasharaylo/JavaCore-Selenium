package homeWork.homeWork03;

public class Main {
    public static void main (String[] args) {

        //Object 1 of Student type //with constructor
        Student kevin = new Student("Kevin", 4.0);
        //input information about students
        kevin.toString();

        //Object 2 of Student type //with constructor
        Student bobby = new Student("Bobby", 5.2);
        //input information about students
        bobby.toString();

        //Object 3 of Student type // without constructor
        Student jenifer = new Student();
        jenifer.setName("Jenifer");
        jenifer.setRating(4.5);
        //input information about students
        jenifer.toString();

        //Display rating of each student

        boolean bestStudent = kevin.betterStudent(3.0);
        boolean bestStudent2 = bobby.betterStudent(5.0);
        boolean bestStudent3 = jenifer.betterStudent(4.0);

        System.out.println("This student better? " + bestStudent);
        System.out.println("This student better? " + bestStudent2);
        System.out.println("This student better? " + bestStudent3);

        //Average rating of all students
        System.out.println("Average rating is: " + ((kevin.setRating() + bobby.setRating() + jenifer.setRating()) / 3));

        System.out.println(Student.counter);
        //Change the rating of any student

        //Display the new average rating

    }
}
