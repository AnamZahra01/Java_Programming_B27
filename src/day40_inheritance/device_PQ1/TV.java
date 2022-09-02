package day40_inheritance.device_PQ1;
//Create a class called TV:
//- attributes: brand, model, price, wireless
public class TV extends Device{

    //constructor
    public TV(String brand, int model, double price, boolean isWireless){
        super(brand, model, price, isWireless);
    }

    //- methods: toString(),
    //	useDevice(): Override to print Using TV
@Override
    public String useDevice(){
        return super.useDevice() + "TV";
    }
}
