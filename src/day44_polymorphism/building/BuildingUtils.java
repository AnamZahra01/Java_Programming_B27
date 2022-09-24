package day44_polymorphism.building;
/*
create a static method rent(Building obj)
        return: double
        parameters: Building type

        implementation:
            if the Building is House type return 1500
            if the Building is Apartment type return 800
            if the Building is OfficeBuilding type return 2000
 */

public class BuildingUtils {
   public static double rent(Building building){
       //Building is abstract, all subclasses will go as parameter
      if(building instanceof House){
          return 1500.0;
      }else if(building instanceof Apartment){
          return 800.0;
      }else if(building instanceof OfficeBuilding){
          return 2000;
      }
        return -1;
   }
//
//    /*
//     create a static method search(String location)
//        return: Building
//        parameters: String location
//
//        implementation
//            if the location is Great Falls return a House object with:
//                location: Great Falls
//                price: 500_000
//                number of residents: 4
//
//            if the location is FairFax return an Apartment object with:
//                location: FairFax
//                price: 250_000
//                month for lease: 6
//
//            if the location is McLean return a OfficeBuilding object with:
//                location: McLean
//                price: 2_000_000
//                number of floors: 6
//     */
   public static Building search(String location){
       //Building is abstract, it returns its subclasses.
        if(location.equalsIgnoreCase("great falls")){
            return new House("Great Falls", 500_000,4); //hard-coded output
        } else if(location.equalsIgnoreCase("fairfax")){
            return new Apartment("FairFax", 250_000,6);
        } else if(location.equalsIgnoreCase("mclean")){
            return new OfficeBuilding("McLean", 2_000_000, 6);
        }
        return null;
    }
}
