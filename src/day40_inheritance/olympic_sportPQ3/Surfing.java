package day40_inheritance.olympic_sportPQ3;

//Create a class Surfing - child class of OlympicSport
public class Surfing extends OlympicSport{

    //	constructor: set name and participants variables
    public Surfing( int participants) {
        super("Surfing", participants);
    }

    //	methods:compete(): Print Surfing the waves
    @Override
    public void complete() {
        System.out.println("Surfing the waves");;
    }
}
