package day42_abstraction.exercise;

public class Running extends Exercise{

    @Override
    public  void  perform(){
        System.out.println("We are running");
    }

    @Override
    public void getCaloriesBurned(int minutes) {
        System.out.println(minutes * 0.35);
    }
}
