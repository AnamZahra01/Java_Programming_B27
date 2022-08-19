package day34_custom_classes.carPQ2;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.model = "Cadillac";
        car1.color = "Black";
        car1.year = 2020;
        car1.fuelLevel = 20;
        car1.drive();
        System.out.println("Gas is Low: " + car1.isLow());
        System.out.println(car1);

        System.out.println();

        Car car2 = new Car();
        car2.model = "Honda";
        car2.color = "White";
        car2.year = 2017;
        car2.fuelLevel = 80;
        car2.drive();
        System.out.println("Gas is Low: " + car2.isLow());
        System.out.println(car2);

    }
}
