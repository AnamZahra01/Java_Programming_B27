package day44_polymorphism.building;
/*
Create a class Apartment
    child class of Building
    implements HasBalcony

     create instance variable
        int months of lease

    create a constructor to assign the location, price, and months of lease

    implement all abstract methods (give some print statements)

    override the toString to print the location, price, and months of lease

 */
public class Apartment extends Building implements HasBalcony {

    int monthsOfLease;
    public Apartment(String location, double price, int monthsOfLease){
        super(location, price);
        this.monthsOfLease = monthsOfLease;
//        System.out.println(BuildingUtils.search(location));

    }
    @Override
    public void pay(){
        System.out.println("Paying Apartment rent");
    }
    @Override
    public void openBalcony(){
        System.out.println("Opening Balcony of Apartment");
    }
    @Override
    public String toString(){
        return super.toString() + "Months Of Lease" + monthsOfLease;
    }

}
