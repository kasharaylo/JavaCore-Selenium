package practics06;

class Employee extends Person {
    private String SSN;

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
}

class InheritanceExample {
    public static void main (String args[]){
        //Create person object
        Person person1 = new Person();
        person1.setName("Pam");
        person1.setAge(32);
        System.out.println(String.format("%s's age is: %s", person1.getName(), person1.getAge()));

        //Create Employee object
        Employee empl1 = new Employee();
        empl1.setName("Stacy");
        empl1.setAge(28);
        empl1.setSSN("341-234-12121");
        System.out.println(String.format("%s's with SSN %s, age is: %s", empl1.getName(), empl1.getSSN(), empl1.getAge()));

    }
}