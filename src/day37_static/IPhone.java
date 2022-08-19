package day37_static;

public class IPhone {

    //instance variables -> unique (every object has its own copy)
    String model;
    String color;
    double price;
    int storage;

    //Static -> shared (1 copy through out)
    static String os;
    static String brand;

    //constructor: to initialize variables
    public IPhone(String model, String color, double price, int storage) {
        System.out.println("Constructor Run");
        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;
    }

    //static block: initialize static variables
    static {
        System.out.println("Static Block Run");
        os = "IOS";
        brand = "Apple";
    }

    //Static block runs once,first time the class is used
    //constructor will be called every time an object is made


    public String toString() { //it is instance method so generates instance variables only
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
