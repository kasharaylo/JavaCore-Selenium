package javaCorePractics.practics07.singleton;

public class Main {
    public static void main(String args[]) {
        Person person1 = new Person();
        Person person2 = new Person();

        System.out.println(person1);
        System.out.println(person2);

        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s);
        System.out.println(s2);
    }
}
