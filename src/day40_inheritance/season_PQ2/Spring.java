package day40_inheritance.season_PQ2;

//Create a class Spring - child class of Season
public class Spring extends Season{

    //	constructor: set values to variables
    public Spring(double highestAverageTemperature, double lowestAverageTemperature) {
        super("Spring", highestAverageTemperature, lowestAverageTemperature);
    }
    //	methods: activity(): Go Outside

    @Override
    public String activity() {
        return "Go Outside";
    }
}
