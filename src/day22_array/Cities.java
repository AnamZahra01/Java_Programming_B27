package day22_array;

import java.util.Arrays;

public class Cities {
    public static void main(String[] args) {
        //Cities as separate String variables -> not useful
        String city1 = "Chicago";
        String city2 = "West Palm";
        String city3 = "Miami";
        String city4 = "New York";
        String city5 = "Toronto";
        String city6 = "Houston";

        //make array to store cities
        String[] cities = {"Chicago", "West Palm", "Miami","New York","Toronto", "Houston" };

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        System.out.println(cities[5]);

        System.out.println(cities); //not useful

        System.out.println(Arrays.toString(cities)); //arrays is utility Class, having utility methods that help us to work with array.
        //arrays and array are different, arrays -> class, array -> object

    }
}
