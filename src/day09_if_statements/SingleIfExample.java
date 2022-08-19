package day09_if_statements;
// if helps us to control how our program should work:
//format shortcut: Option+Command+L;
public class SingleIfExample {
    public static void main(String[] args) {

        if(true){          // only true if statements will print
            System.out.println("Hello");
        }
        if(false){
            System.out.println("Bye");
        }
        System.out.println("------------------------");

        boolean SaimLovesB27;
        if (SaimLovesB27 = true){
            System.out.println("We will get BREAK :)");
        }
        if(SaimLovesB27 = false){
            System.out.println("No Break Today :(");
        }
        System.out.println("------------------------");

        int year = 2022;
        if (year == 2022 || year == 2021){
            System.out.println("Stay home");
            System.out.println("Wash your hands");
            System.out.println("Social distance");
        }
        System.out.println("------------------------");

        double price = 39.99;
        if(price >= 20){
            System.out.println("Free Shipping");
        }
        System.out.println("------------------------");


    }
}

