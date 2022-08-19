package day09_if_statements;

public class Test {

        public static void main(String[] args){
            //Q1

            int i = 51;
            if(i >= 50) {
                System.out.println("Greater than 50");
                System.out.println("Great");
            }
		else {
                System.out.println("Less than 50");
            }
            System.out.println("------------------");

        //Q2
                    int a = 25;
                    if(a < 25)
                        System.out.println("1");
                    if(a > 10)
                        System.out.println("2");
                    else
                        System.out.println("3");
            System.out.println("------------------\nQ3");

            //Q3
            int a1 = 23, b = 30;

            if(a1 > 20 && b > 25)
                System.out.println("1");
            if(a1 > 30 && b < 35)
                System.out.println("2");
            else
                System.out.println("3");

            System.out.println("------------------\nQ4");

            int i2 = 51;

            if(i2 > 50)
                System.out.println("Greater than 50");

           else
                System.out.println("Less than 50");
            System.out.println("Done");

            System.out.println("------------------\nQ5");
            boolean i3 = false;
            boolean j = true;
            if(!i3 && j)
                System.out.println("1");
            else
                System.out.println("2");
            System.out.println("------------------\nQ6");

            String name1="FOX", name2="DOG";
            if(name1 == "FOX")
                System.out.print("FOX ");
            System.out.println("GOOD");
            if(name2 == "CAT")
                System.out.println("DINO");

            System.out.println("------------------\nQ7");

            String name="dino";
            if(name == "dino")
                System.out.print("DINO");
            System.out.println("GOOD");
            System.out.println("------------------\nQ8");


        }
}
