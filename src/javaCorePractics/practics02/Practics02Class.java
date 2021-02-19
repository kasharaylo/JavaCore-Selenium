package javaCorePractics.practics02;
public class Practics02Class {
    public static void main (String[] arg) {

        //OPERATORS
        System.out.println("--------------OPERATORS");
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = b - a;
        int e = a * b;
        int f = b / a;
        int g = a % b;

        System.out.println("a + b = " + c); // + operator output
        System.out.println("b - a = " + d); // - operator output
        System.out.println("a * b = " + e); // * operator output
        System.out.println("b / a = " + f); // / operator output
        System.out.println("a / b = " + g); // % operator output

        //UNARY OPERATORS
        System.out.println("--------------UNARY OPERATORS");
        int z = 5;
        int m, n, v, x;

        m = z++;
        n = z--;
        v = ++z;
        x = --z;
        boolean bool = true;

        System.out.println("z = " + z); // int itself
        System.out.println("z++ = " + m); // increment operator output -next
        System.out.println("z-- = " + n); // decrement operator output -next
        System.out.println("++z = " + v); // increment operator output -previous
        System.out.println("--z = " + x); // decrement operator output -previous
        System.out.println(bool); // logical operator output
        System.out.println(!bool); // logical operator output -invert

        //EQUALITY & RELATIONAL OPERATORS
        System.out.println("--------------EQUALITY & RELATIONAL OPERATORS");
        System.out.println(a == b); // equal -false
        System.out.println(m == x); // equal -true
        System.out.println(a != b); // not equal -true
        System.out.println(m != x); // not equal -false

        //CONDITIONAL OPERATORS
        System.out.println("--------------CONDITIONAL OPERATORS");
        int result = 100;
        String month = "October";
        String month2 = "December";

        System.out.println(result >= 150 && result <= 50); // AND -false
        System.out.println(result >= 50 && result <= 150); // AND - true

        System.out.println(month == "October" || month == "December"); // OR -true
        System.out.println(month2 == "October" || month2 == "December"); // OR -true

        System.out.println(month == "September" || month == "December"); // OR -false
        System.out.println(month2 == "October" || month2 == "September"); // OR -false
    }
}
