package day28_methods;

public class DayInWeek {

    public static String dayInWeek(int day){

        String[] days = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
        return days[day - 1]; //index
    }

    public static void main(String[] args) {

        System.out.println(dayInWeek(4));
        System.out.println(dayInWeek(7));

        switch (dayInWeek(7)){
            case "Mon":
            case "Fri":
                System.out.println("Have full day Java");
                break;
            case "Tue":
            case "Thur":
                System.out.println("Half Java Half Softskills");
                break;
            case "Wed":
                System.out.println("Office Hours");
                break;
            case "Sat":
            case "Sun":
                System.out.println("Off");
        }
    }}
