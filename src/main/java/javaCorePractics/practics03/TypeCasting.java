package javaCorePractics.practics03;

public class TypeCasting {
    public static void main (String[] args) {
        int i = 100;
        long l = i;	//no explicit type casting required
        float f = l;	//no explicit type casting required

        System.out.println(i);
        System.out.println(l);
        System.out.println(f);

        double d = 200.04;
        long g = (long) d; //explicit type casting required
        int m = (int) g; //explicit type casting required

        System.out.println(d);
        System.out.println(g);
        System.out.println(m);
    }
}
