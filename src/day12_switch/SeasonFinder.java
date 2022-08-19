package day12_switch;

import java.util.Scanner;

public class SeasonFinder {
    /*
    PQ-03:  Season Finder
declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month
	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall
Ex:
	2
	It is winter, so wear a winter coat, gloves and a hat
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of month: ");
        int month = input.nextInt();
        String season = " ";
        String kindOfClothes = "";

        switch (month){
            case 1:
            case 2:
            case 12:
                season = "Winter";
                kindOfClothes = "It is "+season + ", so wear a winter coat, gloves and a hat.";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                kindOfClothes = "It is" +season+ ", so wear relaxed suit, trench coat, sneakers and sunglasses.";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                kindOfClothes = "It is " +season+ ", so wear a casual light weight dress.";
                break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                kindOfClothes = "It is "+season+ ", so wear a long dress with short sleeves and bright colours.";
                break;

        }
        System.out.println(season+ " --> " +kindOfClothes);


    }
}
