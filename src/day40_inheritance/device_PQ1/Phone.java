package day40_inheritance.device_PQ1;
//Create a class called Phone:
//- attributes: brand, model, price, wireless

public class Phone extends Device{

    //constructor
    public Phone(String brand, int model, double price, boolean isWireless){
        super(brand, model, price, isWireless);
    }

    //	useDevice(): Override to print Using Phone
    @Override
    public String useDevice(){
        return super.useDevice() + "Phone";
    }
}
