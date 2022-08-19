package day09_if_statements;

public class LunchTime {
    public static void main(String[] args) {

        boolean isHungry = true;
        boolean isLunchTime = true;

        if(isLunchTime && isHungry){
            System.out.println("Go eat lunch");
            System.out.println("Take a break");
        } else {
            System.out.println("Keep studying");
            System.out.println("Practice more JAVA");
        }

    }
}
