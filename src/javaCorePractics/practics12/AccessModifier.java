package javaCorePractics.practics12;

public class AccessModifier {
    public static void main (String args[]){
        Employee100 empl1 = new Employee100();
        //empl1.displayEmployeeName("Kevin"); //private

        empl1.displayEmployeeId(212); //default
        empl1.displayEmployeeSalary(500.40); //protected
        empl1.displayEmployeeBenefits(100.400); //public
    }
}
