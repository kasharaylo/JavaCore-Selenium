package practics06;

public class Practics06Class01 {
    public static void main (String args[]){
        Practics06Class cust1 = new Practics06Class();
        cust1.setName("Mike");
        cust1.setInNum("123345");
        cust1.setAge(50);

        System.out.println(String.format("My Name is %s with id: %s, and and my age is %d", cust1.getName(), cust1.getInNum(), cust1.getAge()));
    }
}
