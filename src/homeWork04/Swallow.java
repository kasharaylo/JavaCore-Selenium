package homeWork04;

public class Swallow extends FlyingBird {

    @Override
    public void feathers() {
        System.out.println("Swallow may have feathers");
    }

    @Override
    public void layEggs() {
        System.out.println("Swallow may have lay Eggs");
    }

    @Override
    void lightweight() {
        System.out.println("Swallow may have lightweight");
    }

    @Override
    void streamlined() {
        System.out.println("Swallow may have streamlined");
    }
}
