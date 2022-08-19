package day12_switch;

import java.util.Scanner;

public class Elevator {
    /*
    PQ-01:  Add new class Elevator, declare and assign a floor number variable. The floor number represent which floor you want the elevator to go to. After getting to each floor show the information of which companies are on that floor. Use the following data:

	floor 1 --> Lobby, StarBucks, Amazon Pick Up
	floor 2 --> NASA, Cydeo, Discover
	floor 3 --> Uber, Lyft, Chase
	floor 4 --> Rooftop, Lounge

	any other floor value --> Invalid Floor Selected
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the floor number you want to go: ");
        int floorNumber = input.nextInt();
        String companyInfo = "";

        switch (floorNumber){                //switch does not work for float, double, long and boolean
            case 1:
                companyInfo = "\nLobby\nStarBucks\nAmazon Pick Up";
                break;
            case 2:
                companyInfo = "\nNASA\nCydeo\nDiscover";
                break;
            case 3:
                companyInfo = "\nUber\nLyft\nChase";
                break;
            case 4:
                companyInfo = "\nRooftop\nLounge";
                break;  //stops the switch
            default:    //defined anywhere in the switch, but it will be the case executed if no other case matches
                companyInfo = "Invalid Floor Selected";
        }
        System.out.print("Floor" +floorNumber+ " : " +companyInfo);

    }
}
