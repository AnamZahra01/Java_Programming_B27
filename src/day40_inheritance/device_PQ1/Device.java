package day40_inheritance.device_PQ1;
//Create a class called device
public class Device {

    //- attributes: brand, model, price, wireless

    String brand;
    int model;
    double price;
    boolean isWireless;

    //constructor
    public Device(String brand, int model, double price, boolean isWireless){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.isWireless = isWireless;
    }
    //- methods: toString(), useDevice()
    public String useDevice(){
        return "Using "  ;
    }
    public String toString(){

        return "Brand: " + brand + ", Model: " + model + ", Price: " +price + ", Wireless: " +isWireless ;
    }
}
