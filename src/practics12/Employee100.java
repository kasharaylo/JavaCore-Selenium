package practics12;

public class Employee100 {
    //private modifier
    private void displayEmployeeName(String name){
        System.out.println("My name is: " + name);
    }
    //default modifier
    void displayEmployeeId(int id){
        System.out.println("My employee id is: " + id);
    }
    //protected modifier
    protected void displayEmployeeSalary(double salary){
        System.out.println("Salary is: " + salary);
    }
    //public modifier
    public void displayEmployeeBenefits(double insurancePercentage){
        System.out.println("Employee insurance is: " + insurancePercentage);
    }

    public static void main(String args[]){
        Employee100 empl1 = new Employee100();
        empl1.displayEmployeeName("Kevin");
        System.out.println(empl1);
    }
}
