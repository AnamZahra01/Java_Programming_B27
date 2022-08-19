package day02_print_statements;

public class EscapeExample {

    public static void main(String[] args) {

//        System.out.println("Today is "Friday"");
//        This is not valid because it thinks the double quotation is for Java syntax, but we want to print the character of double quotation.
        System.out.println("I will learn \"Cydeo\"" );

        //I want to print Today is "Friday"
        System.out.println(" Today is \"Friday\"");

        //I want to print \
        System.out.println("\\ "); // first \ is syntax, second \ is char we want to print.

        //tabbing here
        System.out.println("\tHello");
        System.out.println("\t\tHello");
        System.out.println("--------------------");

        //next line
        System.out.println("Shopping List:\n1)Juice\n2)Chips\n3)Water");
        System.out.println("--------------------");
        System.out.println("Shopping List:\n\t1)Juice\n\t2)Chips\n\t3)Water");




    }
}
