package day40_inheritance.lyftPQ4;

//Create a class LyftXL - child class of Lyft
public class LyftXL extends Lyft{

    //	declare a method calculateRate(miles) - return the cost of the ride: base rate of Lyft ride + 10%
    @Override
    public double calculateRate(double miles) {
        double value = super.calculateRate(miles) ;
        return value + (0.1* value);
    }
}
