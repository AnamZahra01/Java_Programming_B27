/*
age b/w 0 - 120
 */
package day11_nested;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 60;

        if (age > 0 && age < 120 ){
            if (age <= 1){
                System.out.println("Baby");
            } else if (age <= 5) {
                System.out.println("Toddler");
            } else if (age <= 13 ){
                System.out.println("kid");
            } else if (age <= 18) {
                System.out.println("Teenager");
            } else if (age <= 40) {
                System.out.println("Adult");
            } else if (age <= 65) {
                System.out.println("Middle aged Adult");
            } else {
                System.out.println("Senior");
            }

        } else { //age < 0 or age > 120
           // System.out.println( "Invaild age");
        if (age < 0 ){
            System.out.println("age can't be negative");
        } else { //age > 120
            System.out.println("age can't be more than 120");
        }
        }

    }
}
