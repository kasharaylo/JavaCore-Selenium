package javaCoreHomeWork.homeWork06;

public class Main {
    public static void main(String args[]) {

        //Builder
        Solider Bob = Solider.Builder.newInstance()
                .setName("Bob")
                .setLastName("Dylan")
                .setRank("High")
                .setBadgeNumber1(5)
                .setBloodType("A++")
                .setTypeOfTroops("Military")
                .setSex("Male")
                .build();

        System.out.println(Bob);

        //Singleton
        Triangle t1 = Triangle.getInstance();
        Triangle t2 = Triangle.getInstance();
        Triangle t3 = Triangle.getInstance();

        //Default cells
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        //Creating new values
        Triangle triangle = new Triangle();
        triangle.setA(1);
        triangle.setB(2);
        triangle.setC(3);

        //System.out.println(calculatePerimeter);

    }
}
