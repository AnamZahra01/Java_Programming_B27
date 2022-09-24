package day44_polymorphism.building;
/*
 Create the objects of the House using all these references and check what the object has access to:
        House, Building, HasBackyard
 */
public class Runner {
    public static void main(String[] args) {


        House house = new House("Great Falls", 20000,7);
        System.out.println(BuildingUtils.search(house.location));
        house.pay();
        house.mowLawn();
        System.out.println();
        System.out.println(BuildingUtils.rent(house));

        House house1 = new House("FairFax", 1000,2);
      //  System.out.println(BuildingUtils.search(house.location));

        System.out.println();

        Building obj = new House( "DHA", 80000,4);
        System.out.println(obj);
        obj.pay();
        System.out.println();

        BuildingUtils.rent(new OfficeBuilding("Texas", 12300 , 4));


        HasBackyard obj2 = new House( "Islamabad", 25000,8);
        System.out.println(obj2);
        obj2.mowLawn();
        System.out.println();

        System.out.println(BuildingUtils.search("fairfax"));

    }
}
