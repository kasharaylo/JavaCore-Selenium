package javaCorePractics.practics07.builder;

public class Main {
    public static void main(String args[]) {
        User nazar = new User("Nazar", "Dodor", "Lviv, Street");

        User ivan = User.Builder.newInstance()
                .setName("Ivan")
                .setAddress("Dnipro, Street")
                .setLastName("Ivanov").build();

        System.out.println(nazar);
        System.out.println(ivan);
    }
}
