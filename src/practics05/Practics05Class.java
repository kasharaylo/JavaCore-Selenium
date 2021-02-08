package practics05;

public class Practics05Class {
    public void getDogAge (int age) {
        int dogAge = age + 12; //local variable
        System.out.println("Dog age is " + dogAge);
    }

    public static void main (String[] args) {
        Practics05Class a1 = new Practics05Class();
        a1.getDogAge(10);
    }
}
