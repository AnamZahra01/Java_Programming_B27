package day37_static.pq1;

//Computer - static
//    class name: Computer:

public class Computer {
//        instance variables:  price, brand, color, ... creating object (initializing using constructor)
    double price;
    String brand;
    String color;
    boolean hasWebCam;

    // constructor -> to initialize all instance variables one time
    public Computer(double price, String brand, String color, boolean hasWebCam ) {
        this.price = price;
        this.brand = brand;
        this.color = color;
        this.hasWebCam = hasWebCam;
    }

//        static variables: hasScreen, hasBattery, hasMemory
// static values has one copy and fixed value
    static boolean hasScreen ; // return -> true or false
    static boolean hasBattery ;
    static boolean hasMemory  ;

    static { //better way to make static package: to access from other packages too
        //runs first, if conditions
        hasScreen = true;
        hasBattery = true;
        hasMemory = true;
    }

    public String toString() { //prints instance variables
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", has web camera = '" + hasWebCam + '\'' +
                '}';
    }
}

