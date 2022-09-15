package day42_abstraction.carPQ2;

//Create a concrete class Tesla - subclass of ElectricCar
public class Tesla extends ElectricCar{

    //    override the start method to print: - key card nearby, starting car
    @Override
    public void start() {
        System.out.println("Key card nearby, starting car");
    }

    //    override the charge method to print: -  at tesla charging station
    @Override
    public void charge() {
        System.out.println("At tesla charging station");
    }
}
