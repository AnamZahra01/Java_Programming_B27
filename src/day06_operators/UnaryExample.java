package day06_operators;

public class UnaryExample {
    public static void main(String[] args) {

        int n = 0; //0
        n++;        //0
        System.out.println(n);  //1

        ++n;//2
        System.out.println(n);

        System.out.println(n++); //prints the current value, then increments by 1 in next step.

        System.out.println( ++n); //prints previous value, and increment after in next step.
        System.out.println(++n);//5
        System.out.println("-------------");

        int x =4 ; int y = x;
        int z = ++x;                    //x updated, code never goes back, so new value becomes x.
        System.out.println("x = " + x); // 5
        System.out.println("y = " + y); // 4
        System.out.println("z = " + z); // 5
        System.out.println("-------------");

        int candy = 5;
        System.out.println("Your kid asks for candy, you have " + candy );
        System.out.println("you give 1 to them, now you have " + --candy); //you subtract first,then prints.
        System.out.println("the sibling comes in and they want one, you check how many are there then give them one " + candy--); //post decrement
        System.out.println("total candy in jar now " + candy);

        //USE CASE: counting

        int counter = 0;
        counter ++;


    }
}
