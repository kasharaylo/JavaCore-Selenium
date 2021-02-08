package practics05;

public class Practics05Class04 {
    public static void main (String args[]){
        Integer a = 100;
        Integer b = 34;
        Integer c = 13;
        Integer d = 100;
        System.out.println(a.intValue());
        System.out.println(b.doubleValue());
        System.out.println(c.floatValue());

        System.out.println(Integer.parseInt("20202020"));
        System.out.println(Integer.compare(100, 100));
        System.out.println(Integer.compare(100, 90));
        System.out.println(Integer.compare(90, 100));

        System.out.println(a.equals(d));
        System.out.println(a.equals(c));

    }
}
