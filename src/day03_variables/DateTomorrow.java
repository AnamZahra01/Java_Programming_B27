package day03_variables;

public class DateTomorrow {
    public static void main(String[] args) {

//        int day = 13;
//        int month = 06;
//        int year = 2022;

        int month, day, year; //all variables are same type.
        month = 6;
        day = 13;
        year = 2022;

        System.out.println("Today's Date: " + month + "\\" + day + "\\" + year);

        day = 14; //updated value
        System.out.println("Tomorrow's Date: " + month + "\\" + day + "\\" + year);

    }
}
