package day48_maps;

import java.util.*;

public class Countries {
    public static void main(String[] args) {
        System.out.println();

        //key - countries - String
        //value - cities - List<String> -> more flexible to use as compared to ArrayList, but both are fine
        Map<String, List<String>> countries = new HashMap<>();
        countries.put("United States", new ArrayList<>(Arrays.asList("Chicago", "Dallas", "Irvine","San Diego","New York", "Philadelphia", "Madison")));

        //Arrays.asList() --> immutable List
        System.out.println(countries);
        countries.get("United States").add("Seattle");
        System.out.println("ArrayList "+countries.get("United States"));
        System.out.println("First city "+countries.get("United States").get(0)); //first get from map, second get from arrayList --> First city Chicago
        System.out.println(countries);

        countries.put("Europe", new ArrayList<>(Arrays.asList("London", "Paris", "Rome", "Istanbul", "Berlin", "Madrid")));
        System.out.println(countries);
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Which country are you going to tour?" + countries.keySet());
        String country = input.nextLine();

        for(String eachCity : countries.get(country)){ //iterates through each city of a specific country
            System.out.println("Touring...." + eachCity);
        }

        System.out.println();
        for(Map.Entry<String , List<String >> eachEntry : countries.entrySet()){ // Map.Entry -> all values stored

            for(String eachCity : eachEntry.getValue()){
                if(eachCity.startsWith("A") || eachCity.endsWith("a"))
                    System.out.println(eachCity);
            }
        }

        //OR for(List<String> eachCountry : countries.values()){

    }
}
