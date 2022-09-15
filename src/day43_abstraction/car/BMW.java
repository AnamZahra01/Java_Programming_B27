package day43_abstraction.car;

public class BMW extends Car{

    @Override
    public void start() {
        System.out.println("Pressing the button to start");
    }
//    public void start(int a) {
//        //can we overload? yes
//    }
}
