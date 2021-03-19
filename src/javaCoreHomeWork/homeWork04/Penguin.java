package javaCoreHomeWork.homeWork04;

public class Penguin extends NonflyingBird {

    @Override
    public void feathers() {
        System.out.println("Penguin may have feathers");
    }

    @Override
    public void layEggs() {
        System.out.println("Penguin may have lay Eggs");
    }

    @Override
    void swimming() {
        System.out.println("Penguin may have swimming");
    }

    @Override
    void diving() {
        System.out.println("Penguin may have diving");
    }
}
