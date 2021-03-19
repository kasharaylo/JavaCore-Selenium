package javaCorePractics.practics05;

class Practics05Class01 {
    public static String name;
    public static String address;
    static double balance;
}

class DisplayInfo {
    public static void main (String args[]) {
        Practics05Class01.name = "Danny";
        Practics05Class01.address = "California 001";
        System.out.println(Practics05Class01.name);
        System.out.println(Practics05Class01.address);
        Practics05Class01.name = "Kevin";
        Practics05Class01.address = "New York 002";
        System.out.println(Practics05Class01.name);
        System.out.println(Practics05Class01.address);

        Practics05Class01.balance = 2500;
        System.out.println(Practics05Class01.balance);
    }
}
