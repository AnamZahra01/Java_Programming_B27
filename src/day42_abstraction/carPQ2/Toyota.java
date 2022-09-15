package day42_abstraction.carPQ2;

//Create a concrete class Toyota - subclass of Car
public class Toyota extends Car{

    //    override the start method to print:-turning key to start
    @Override
    public void start() {
        System.out.println("Turning key to start");
    }
}
