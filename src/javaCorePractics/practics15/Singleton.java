package javaCorePractics.practics15;

public class Singleton {
    private static Singleton instance;

    //Singleton realization
    public static Singleton getInstance() {
        if (instance == null) {
            return instance = new Singleton();
        }
        return instance;
    }
}
