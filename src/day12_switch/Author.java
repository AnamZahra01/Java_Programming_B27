package day12_switch;

import java.util.Scanner;

public class Author {
    /*
   PQ-04:   [Author] - Look at Starbucks from class for an idea
You are an author. You are writing a book and want to figure out some information related to the genre of book you are writing.
Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in. Find and print the information based on the genre.
Make variables for all of that information. Given empty defaults for all the variables
    Data based on genre:

        genre - Fantasy
        page length - 500
        profit - 1,000,000
        sequels - 5
        countries - 50

        genre - Detective
        page length - 350
        profit - 700,000
        sequels - 3
        countries - 45

        genre - Science Fiction
        page length - 720
        profit - 900,500
        sequels - 4
        countries - 30

        genre - Short Story
        page length - 150
        profit - 300,000
        sequels - 1
        countries - 40
     */
    public static void main(String[] args) {

        int pageLength = 0, profit = 0, sequels = 0, countries = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the genre please: ");
        String genre = input.nextLine();

        switch (genre){

            case "Fantasy":
                pageLength = 500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                break;
            case "Detective":
                pageLength = 350;
                profit = 700_000;
                sequels = 3;
                countries = 45;
                break;
            case "Science Fiction":
                pageLength = 720;
                profit = 900_500;
                sequels = 4;
                countries = 30;
                break;
            case "Short Story":
                pageLength = 150;
                profit = 300_000;
                sequels = 1;
                countries = 40;
                break;

        }
        System.out.println("pageLength - " + pageLength+ "\nprofit - " +profit+ "\nsequels - " +sequels+ "\ncountries - " +countries);
    }
}
