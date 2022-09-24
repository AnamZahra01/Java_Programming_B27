package day44_polymorphism.building;
/*
Create a class OfficeBuilding
    child class of Building
    implements HasElevator

    create instance variable
        int number of floors

    create a constructor to assign the location, price, and number of floors

    implement all abstract methods (give some print statements)

    override the toString to print the location, price, and number of floors
 */
public class OfficeBuilding extends Building implements HasElevator {
    int numberOfFloors;
    public OfficeBuilding(String location, double price, int numberOfFloors){
        super(location, price);
        this.numberOfFloors = numberOfFloors;

    }

    @Override
    public void pay(){
        System.out.println("Paying for Office Building");
    }
    @Override
    public void elevator(int numberOfFloors){
        System.out.println("Go To Floor Number " + numberOfFloors);
    }
    @Override
    public String toString(){
        return super.toString() + "Number Of Floors" + numberOfFloors;
    }
}
