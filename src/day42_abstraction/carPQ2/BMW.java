package day42_abstraction.carPQ2;

//Create a concrete class BMW - subclass of Car
public class BMW extends Car{

    //    override the start method to print:-pressing button to start
    @Override
    public void start() {
        System.out.println("Pressing button to start");
    }
}
