package day44_polymorphism.building;

import java.util.ArrayList;

/*
With ArrayList
    create a class BuildingMarket
    create a main method
    create an ArrayList of Building
        -> this can hold objects of House, Apartment, & OfficeBuilding
    create a bunch of House, Apartment, & OfficeBuilding objects and store them into the ArrayList
 */
public class BuildingMarket {
    public static void main(String[] args) {
        ArrayList<Building> allBuildings = new ArrayList<>();

        allBuildings.add(new House( "Pakistan", 40000,5));
        allBuildings.add(new House("Lahore", 50000 ,3));
        allBuildings.add(new House("Chicago", 5000 ,2));
        allBuildings.add(new Apartment("Woodbridge", 2000, 6));
        allBuildings.add(new Apartment("California", 700, 4));
        allBuildings.add(new OfficeBuilding("New york", 20000, 2));
        allBuildings.add(new OfficeBuilding("Chicago", 1000, 1));

        allBuildings.add(BuildingUtils.search("Great Falls"));
       // allBuildings.addAll(Arrays.asList(obj1,obj2,obj3, obj4));
        System.out.println(allBuildings);
        System.out.println();


        // - Find the most expensive Buildings, print all its information
        Building expensiveBuilding = allBuildings.get(0);
        double maxPrice = allBuildings.get(0).price;
        for(Building each : allBuildings){
            if(each.price > maxPrice){
                maxPrice = each.price;
                expensiveBuilding = each;
            }
        }
        System.out.println(expensiveBuilding);
        System.out.println();

        // - Find the least expensive Buildings, print all its information
        Building leastExpensive = allBuildings.get(0);
        double minPrice = allBuildings.get(0).price;
        for(Building each : allBuildings){
            if(each.price < minPrice){
                minPrice = each.price;
                leastExpensive = each;
            }
        }
        System.out.println(leastExpensive);
        System.out.println();
        //  - Filter all the Buildings in one location(ex search for buildings in Chicago)
        ArrayList<Building> inChicago = new ArrayList<>(allBuildings);
        inChicago.removeIf(p -> !p.location.equalsIgnoreCase("Chicago"));
        System.out.println("In Chicago: " + inChicago);
        System.out.println();
        //  - Filter all the Buildings within a certain price range

        ArrayList<Building> inRange = new ArrayList<>(allBuildings);
        inRange.removeIf(p -> p.price>=50000);
        System.out.println("in range: " + inRange);
        System.out.println();
    }
}
