package day09_if_statements;

public class PayDay {
    public static void main(String[] args) {

        double hourlyRate = 60;
        int hoursPerWeek = 50;
        double netPay;

        if(hoursPerWeek > 40){
            //over time calculation
            int overTimeHours = hoursPerWeek - 40;          // 50-40 = 10 hours over time
            netPay = hourlyRate * 40;                       //calculate normal pay for 40 hours a week
            netPay += hourlyRate * overTimeHours * 1.5;      //total earned from over time

        } else {
            //no over time
            netPay = hourlyRate * hoursPerWeek;
        }

        System.out.println("Your net pay is " +netPay);



    }
}
