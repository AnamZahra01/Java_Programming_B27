package day40_inheritance.season_PQ2;
//Create a class Summer -     child class of Season
public class Summer extends Season{

    //	constructor: set values to variables
    public Summer( double highestAverageTemperature, double lowestAverageTemperature) {
        super("Summer", highestAverageTemperature, lowestAverageTemperature);
    }
    //	methods:activity(): Drink Lemonade
@Override

    public String activity() {

        return "Drink Lemonade";
    }
}
