package homeWork03;

public class Student {
    //private fields
    private String name;
    private double rating;
    public static int counter;

    //methods for access to fields
    public void setName(String isName) {
        name = isName;
    }

    public void setRating(double isRating) {
        rating = isRating;
    }

    //Display the info about all students.
    public String toString () {System.out.println("My name is: " + name + " and rating is: " + rating);
        return null;
    };

    //default constructor
    public Student() {}

    //constructor with parameters
    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        counter++;
    }

    // Display the average rating of all students.
    public boolean betterStudent (double rating) {
        if (rating > 4.0) {
            return true;
        } else {
            return false;
        }
    }

    public double setRating() {
        return rating;
    }

    //Average rating of all students

    //public void changeRating ();

    //Change the rating of any student

    //Display the new average rating
}
