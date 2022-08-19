package day37_static.drive;

public class Street {
    public static void main(String[] args) {

        DriverCall bmw = new DriverCall ("X5", "James", 3124567, 'C');

        System.out.println(bmw.driver);
        System.out.println(bmw.driver.name);
        System.out.println(bmw.model);

        DriverCall bmw2 = new DriverCall("X5",  "Bond", 12345, 'A');
        System.out.println(bmw2.driver);

        Driver obj1 = new Driver("Anam", 34567, 'B');
        System.out.println(obj1);

    }
}
