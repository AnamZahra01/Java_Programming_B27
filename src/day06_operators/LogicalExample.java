package day06_operators;

public class LogicalExample {
    public static void main(String[] args) {
        
        boolean isWeekend = true;
        boolean isGoodTemp = true;
        boolean doBbq = isWeekend && isGoodTemp; // for AND: all booleans need to be true

        System.out.println(doBbq);
        System.out.println("------------------");

        boolean isTeacher = true;
        boolean isPolice = false;
        boolean isFirefighter = false;
        boolean getDiscount = isTeacher || isPolice || isFirefighter ; //for OR: one boolean needs to be true

        System.out.println("getDiscount = " + getDiscount);
        System.out.println("-------------------");

        //goal: 5 < number < 10;
        int number = 9;
        System.out.println( 5 < number && number < 10); // AND : All true
        System.out.println();
        System.out.println("-------------------");

        int age = 40;
        boolean inValidAge = age < 0 || age > 120 ; // 1condition = true --> true
        System.out.println("inValidAge = " + inValidAge);
 //  10 > 9 =True
        // 9 < 8 = False

        //sym1 > sym2 .  sym 1 < sym 2.


    }
}
