package day12_switch;

public class Starbucks {
    public static void main(String[] args) {
        /*
        drink:
            price
            calories
        tall:
            2.50
            100
        grande:
            4.00
            150
        venti:
            4.50
            200
         */

       String size = "tall";
       double price = 0;
       int calories = 0;

       switch (size){
           case "tall":
               price = 2.50;
               calories = 100;
               break;
           case "grande":
               price = 4.00;
               calories = 150;
               break;
           case "venti":
               price = 4.50;
               calories = 200;
               break;

       }
       if (price != 0 && calories != 0) {
           System.out.println("Size: " + size + " is " + calories + " calories and cost is $" + price);
       } else {
           System.out.println("Sorry! We do not serve this");
       }


    }
}
