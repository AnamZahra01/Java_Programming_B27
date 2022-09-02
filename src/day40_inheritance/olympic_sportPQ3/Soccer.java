package day40_inheritance.olympic_sportPQ3;

//Create a class Soccer -	child class of OlympicSport
public class Soccer extends OlympicSport{

    //	constructor: set name and participants variables
    public Soccer(int participants) {
        super("Soccer", participants);
    }

    //	methods:compete(): Print Playing a soccer game
    @Override
    public void complete() {
        System.out.println("Playing a soccer game");
    }
}
