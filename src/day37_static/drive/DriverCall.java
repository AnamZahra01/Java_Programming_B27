package day37_static.drive;

public class DriverCall {

    //instance variables
    String model;
    Driver driver; //Driver is custom Class

    public DriverCall(String model, String name, long licenseNumber, char licenseType){

        this.model = model;
        driver = new Driver(name, licenseNumber, licenseType); // Driver object inside constructor
    }
    public DriverCall(String  model, Driver driver){ //overload
        this.model = model;
        this.driver = driver;
    }
//Q: Can we have an Object as Instance variable? Yes
}
