package practics02;

public class Practics02Class07 {

    public static double add(int num1, int num2) {
        double total = num1 + num2;
        return total;
    }

    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;

        double sum = add(number1, number2);
        System.out.println("Number is: " + sum);
    }

    /*
    public static void main2(String args[]) {
        System.out.println(add2(num1:21, num2:22));
    }

    public static int add2(int num1, int num2) {
        return num1 + num2;
    }

    //
    public static void main3(String[] args) {
        System.out.println(isEven(number: 20));
    }

    public static Boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }*/
}
