package homeWork.homeWork04;

public class Eagle extends FlyingBird {

    @Override
    public void feathers() {
        System.out.println("Eagle may have feathers");
    }

    @Override
    public void layEggs() {
        System.out.println("Eagle may have lay Eggs");
    }

    @Override
    void lightweight() {
        System.out.println("Eagle may have lightweight");
    }

    @Override
    void streamlined() {
        System.out.println("Eagle may have streamlined");
    }
}
