package javaCorePractics.practics08;
//Overriding
public class OverridingMethod {
    public static void main (String args[]){
        Aninal animal1 = new Aninal();//references to Animal class
        Aninal animal2 = new Dog();//references to Dog class (overriding)
        Dog animal3 = new Dog();

        animal1.talk();
        animal2.talk();
        animal3.talk();
    }
}
