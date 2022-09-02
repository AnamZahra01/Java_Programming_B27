package day42_abstraction.exercise;

public class Bench extends Lifting{
    @Override
    public void perform() {
        System.out.println("Benching press");
    }

    @Override
    public void getCaloriesBurned(int minutes) {
        System.out.println(10 * minutes);

    }

    @Override
    public void rackWeights() {
        System.out.println("putting bar bench on rack");

    }
}
