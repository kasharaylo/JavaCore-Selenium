package practics07.singleton;

public class Singleton {
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            return instance = new Singleton();
        }
        return instance;
    }
}
