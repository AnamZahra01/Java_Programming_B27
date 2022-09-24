package day44_polymorphism.building;
/*
Create a class House
    child class of Building
    implements HasBackyard

    create instance variable
        int number of residents

    create a constructor to assign the location, price, and number of residents

    implement all abstract methods (give some print statements. Ex: Paying for House, or Going into Backyard)

    override the toString to print the location, price, and number of residents
 */
public class House extends Building implements HasBackyard{

    int numberOfResidents;
    public House( String location, double price, int numberOfResidents){
        super(location,price);
        this.numberOfResidents = numberOfResidents;

    }

    @Override
    public void pay(){
        System.out.println("Paying for House");
    }

    @Override
    public void mowLawn(){
        System.out.println("Mowing Lawn of House");
    }

    @Override
    public String toString(){
        return super.toString() + ", Number Of Residents= " + numberOfResidents + "}";
    }
}
