package day40_inheritance.season_PQ2;
//Create a class Season
public class Season {

    //	instance variables- name (String)- highest average temperature- lowest average temperature

    String name;
    double highestAverageTemperature;
    double lowestAverageTemperature;

    //	constructor:- initialize all fields

    public Season(String name, double highestAverageTemperature, double lowestAverageTemperature) {
        this.name = name;
        this.highestAverageTemperature = highestAverageTemperature;
        this.lowestAverageTemperature = lowestAverageTemperature;
    }

    //	methods:- activity(), toString()

    public String activity(){
        return  "Generic Season";
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestAverageTemperature=" + highestAverageTemperature +
                ", lowestAverageTemperature=" + lowestAverageTemperature +
                '}';
    }
    //	List the is a relations of all the classes
    /* Season -> Super class
    Winter, Summer , Fall, Spring -> sub class
     */
}
