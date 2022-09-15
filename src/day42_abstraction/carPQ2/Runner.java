package day42_abstraction.carPQ2;

public class Runner {
    public static void main(String[] args) {
         //we can not make objects of abstract classes, here Car and ElectricCar are non-instantiated

        Toyota obj1 = new Toyota();
        obj1.start();
        System.out.println();

        BMW obj2 = new BMW();
        obj2.start();
        System.out.println();

        Tesla obj3 = new Tesla();
        obj3.start();
        obj3.charge();

    }
}
