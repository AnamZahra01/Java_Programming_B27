package day10_if_statements;
// Note: Prefer to use brackets no matter what.
public class IfWithNoBrackets {
    public static void main(String[] args) {

        if(3 < 9){
            System.out.println("First");
            System.out.println("Second");
        }

        if (3 > 9)
            System.out.println("Third"); //directly related to if statement block.without brackets
        System.out.println("Fourth");   //this is not part of if statement, normal print statement
        System.out.println("-----------------");

        if (5 % 2 == 0)
            System.out.println("even"); // single statement -> you can run without brackets
      //  System.out.println("line2");
        else
            System.out.println("odd");  // multiple lines need to be inside the bracket.
        System.out.println("------------------");



    }
}
