package day40_inheritance.season_PQ2;

//Create a class Fall - child class of Season
public class Fall extends Season{

    //	constructor: set values to variables
    public Fall( double highestAverageTemperature, double lowestAverageTemperature) {
        super("Fall", highestAverageTemperature, lowestAverageTemperature);
    }

    //	methods:activity(): Read A Book
    @Override
    public String activity() {
        return "Read A Book";
    }
}
