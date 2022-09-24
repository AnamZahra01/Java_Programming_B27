package day36_custom_classes;

import java.util.ArrayList;

public class OfferObject {
    public static void main(String[] args) {

        ArrayList<Offer>  allOffers = new ArrayList<>();
        allOffers.add(new Offer("Amazon", "San Diego", 120_000, true, 15));
        allOffers.add(new Offer("Chase", "Chicago", 125_000, true, 15));
        allOffers.add(new Offer("Google", "Seattle", 170_000, false, 0));
        allOffers.add(new Offer("Accenture", "Chicago", 110_000, false, 5));
        allOffers.add(new Offer("Walmart", "Chicago", 125_000, false, 0));
        allOffers.add(new Offer("Meta", "Seattle", 135_000, true, 12));
        allOffers.add(new Offer("Deloitte", "Seattle", 135_000, true, 12));

        //using lambda is better option, we are staying in ArrayList
        ArrayList<Offer> localOffers = new ArrayList<>(allOffers);
        localOffers.removeIf(Offer -> !Offer.location.equals("Chicago"));
        System.out.println(localOffers);

//        //alternative, manually -> we go outside ArrayList
//        for(Offer each: allOffers){
//            if(each.location.equals("Chicago")){
//                System.out.println(each);
//            }
//        }

        //remove if not full time
        System.out.println();
        ArrayList<Offer> onlyFullTime = new ArrayList<>(allOffers);
        onlyFullTime.removeIf(p -> !p.isFullTime);
        System.out.println(onlyFullTime);

        System.out.println();
        //remove offers less than 120,000
        ArrayList<Offer> minSalary = new ArrayList<>(allOffers);
        minSalary.removeIf(p -> p.salary < 130_000);
        System.out.println(minSalary);

        //find lowest or biggest salary
        double min = allOffers.get(0).salary;
        double max= allOffers.get(0).salary;

        for(Offer each : allOffers){

            if(each.salary > max){
                max = each.salary;
            }

            if(each.salary < min){
                min = each.salary;
            }
        }

        System.out.println("Min salary: "  +min);
        System.out.println("Max salary: "  +max);


    }
}
