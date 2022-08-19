package day36_custom_classes.offerPQ2;

//    Create a separate class to create and test the Offer objects

import java.util.ArrayList;

public class OfferObject {
    public static void main(String[] args) {


//    create multiple Offer objects and store them into an ArrayList of Offers. Create multiple other Lists to filter out different information:

        ArrayList<Offer> offerList = new ArrayList<>();

        Offer obj1 = new Offer("Google", "Pakistan", 80_000);
        offerList.add(obj1);

        offerList.add(new Offer("Amazon", "Chicago", 1_00_000));
        offerList.add(new Offer("Facebook", "Newyork", 20_000, true, 10));
        offerList.add(new Offer("Meta", "Seattle", 135_000, true, 12));
        offerList.add(new Offer("Deloitte", "Seattle", 135_000, true, 12));
        System.out.println(offerList);
        System.out.println();

//        write a program that can only keep the offers from local area

        ArrayList<Offer> localOffers = new ArrayList<>();
        for(Offer each : offerList ){
            if(each.location.equals("Seattle")){
                localOffers.add(each);
            }
        }
        System.out.println(localOffers);
        System.out.println();

//        write a program that can remove the offers that are not full Time

        ArrayList <Offer> fullTime = new ArrayList<>(offerList);
        fullTime.removeIf(Offer -> !Offer.isFullTime);
        System.out.println(fullTime);
        System.out.println();

//        write a program that removes all offer that are less than 100,000 salary

        ArrayList<Offer> minSalary = new ArrayList<>(offerList);
        minSalary.removeIf(Offer -> Offer.salary < 100_000);
        System.out.println(minSalary);
        System.out.println();

//        - Find the biggest and lowest salary Offers and print the whole object

        double maximumSalary = offerList.get(0).salary;
        double minimumSalary = offerList.get(0).salary;
        String minSalaryObj = "";
        String maxSalaryObj = "";


      //  for (Offer each : offerList){
            for(int i = 0; i < offerList.size(); i++ ){
            if(offerList.get(i).salary > maximumSalary){
                maximumSalary = offerList.get(i).salary;
                maxSalaryObj = String.valueOf(offerList.get(i));

            }
            if(offerList.get(i).salary < minimumSalary){
                minimumSalary = offerList.get(i).salary;
                minSalaryObj  = String.valueOf(offerList.get(i));
            }
        }
        System.out.println(maximumSalary);
        System.out.println(minimumSalary);
        System.out.println(maxSalaryObj);
        System.out.println(minSalaryObj);


    }
}
