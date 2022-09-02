package day40_inheritance.season_PQ2;
//Create a class Winter - child class of Season

public class Winter extends Season {
    //	constructor: set values to variables

    public Winter(double highestAverageTemperature, double lowestAverageTemperature) {
        super("Winter", highestAverageTemperature, lowestAverageTemperature);
    }

    //		override activity in sub classes
    //	methods:activity(): Print Use Fireplace
    @Override
    public String activity() {
        return "Using FirePlace";
    }
}
