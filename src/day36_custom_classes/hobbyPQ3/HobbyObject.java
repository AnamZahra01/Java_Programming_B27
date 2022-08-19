package day36_custom_classes.hobbyPQ3;

import java.util.ArrayList;

//    Create a separate class to create and test the Hobby objects
public class HobbyObject {
    public static void main(String[] args) {


//        - create an ArrayList of Hobby objects
        ArrayList<Hobby> hobbyList = new ArrayList<>();

//        - create and add a couple Hobby objects

        hobbyList.add(new Hobby("Cooking", 6000));
        hobbyList.add(new Hobby("Fishing", 500, true, false ));
        hobbyList.add(new Hobby("Golf", 400, true, false));
        hobbyList.add(new Hobby("Puzzles", 100, false, true));
        hobbyList.add(new Hobby("Programming" , 8000, false, false));

//        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        for(Hobby each : hobbyList){
            each.doIt();
        }
        System.out.println();

//        - create a copy ArrayList and remove all outdoors Hobbies
        ArrayList<Hobby> inDoorHobbies = new ArrayList<>(hobbyList);
        inDoorHobbies.removeIf(Hobby -> Hobby.outDoor == true);
        System.out.println(inDoorHobbies);
        System.out.println();

//        - create a copy ArrayList and remove all hobbies requiring other people
        ArrayList<Hobby> onePlayer = new ArrayList<>(hobbyList);
        onePlayer.removeIf(Hobby -> Hobby.requireOthers == true);
        System.out.println(onePlayer);
        System.out.println();

//        - create a copy ArrayList and remove all hobbies that cost more than $500 annually

        ArrayList<Hobby> costLessThan500 = new ArrayList<>(hobbyList);
        costLessThan500.removeIf(H -> H.annualCost >= 500);
        System.out.println(costLessThan500);
    }
}
