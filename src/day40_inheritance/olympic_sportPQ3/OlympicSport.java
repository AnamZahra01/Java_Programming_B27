package day40_inheritance.olympic_sportPQ3;

//Create a class OlympicSport
public class OlympicSport {

    //	instance variables- name (String)- participants (int)
    String name;
    int participants;

    //	constructor:	- initialize all fields
    public OlympicSport(String name, int participants) {
        this.name = name;
        this.participants = participants;
    }

    //	methods:	- compete(), toString()
    //		override compete in subclasses
    public void complete() {
        System.out.println("Completed Sports");
        ;
    }

    @Override
    public String toString() {
        return "OlympicSport{" +
                "name='" + name + '\'' +
                ", participants=" + participants +
                '}';
    }
}
