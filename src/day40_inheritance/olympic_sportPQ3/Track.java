package day40_inheritance.olympic_sportPQ3;

//Create a class Track - child class of OlympicSport
public class Track extends OlympicSport {
    //	constructor: set name and participants variables
    public Track(int participants) {
        super("Tracking", participants);
    }

    //	methods:compete(): Print Track for running, jumping, throwing
    @Override
    public void complete() {
        System.out.println("Track for running, jumping, throwing");
    }
}
