package practics09;

public class CorrectAbstractInheritance {
    public static void main(String args[]){
        Employee empl1 = new Employee();
        empl1.setName("Kevin");
        empl1.setAddress("Chicago");
        empl1.setEmpId("3223232");
        System.out.println(empl1.getCustomerInfo());
    }
}
