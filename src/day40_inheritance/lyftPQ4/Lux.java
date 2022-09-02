package day40_inheritance.lyftPQ4;

//Create a class Lux - child class of Lyft
public class Lux extends Lyft{

    //	declare a method calculateRate(miles) - return the cost of the ride: base rate of Lyft ride + 20%
   @Override
    public double calculateRate(double miles){
        double value = super.calculateRate(miles);
        return value + (0.2 * value);
    }
}
