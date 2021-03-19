package javaCorePractics.practics09;

public class Employee extends Customer{
    private String empId;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Override
    public String getCustomerInfo() {
        String string = new String();
        return string.format("Customer: %s, EmpId: %s, Address: %s", getName(), getEmpId(), getAddress());
    }
}
