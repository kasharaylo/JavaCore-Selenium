package javaCorePractics.practics04;

public class ConstructorMethod01 {
    //Constructor Method 01
    public ConstructorMethod01() {
        System.out.println("This is Constructor Method");
    }

    //Constructor Method 01 with param
    public ConstructorMethod01(String param) {
        System.out.println("This is Constructor Method with param " + param);
    }

    //Instance method
    public void InstanceMethod(){
        System.out.println("This is instance method");
    }
}

class ConstructorMethodExample {
    public static void main(String args[]) {
        //Create object method with default param
        ConstructorMethod01 method1 = new ConstructorMethod01();
        ConstructorMethod01 method2 = new ConstructorMethod01("with param");
        method1.InstanceMethod();
        method2.InstanceMethod();
    }
}
