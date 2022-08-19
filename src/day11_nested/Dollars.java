package day11_nested;
 /*
 1 dollar and you get back change
 change will be in quarters, nickles, dimes, pennies
  */
public class Dollars {
    public static void main(String[] args) {

        int money = 67 ; //cents, where 100 is 1 dollar
        int quarter = money / 25;
        int dime = money % 25 / 10;
        int nickles = money % 25 % 10 / 5;
        int pennies = money % 25 % 10 % 5;

        System.out.println("quarter = " + quarter);
        System.out.println("dime = " + dime);
        System.out.println("nickles = " + nickles);
        System.out.println("pennies = " + pennies);

    }
}
