package day43_abstraction.car;

public class Tesla extends ElectricCar{
    @Override
    public void charge() {
        System.out.println("At tesla charging station");
    }
    @Override
    public void start(){
        System.out.println("Key card near-by, starting car");
    }
}
