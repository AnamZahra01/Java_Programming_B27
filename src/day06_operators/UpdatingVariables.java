package day06_operators;

public class UpdatingVariables {
    public static void main(String[] args) {

        int n = 10;

        //reassign a new value
        n = 20;

        //alternate
        int a = 3;
        a = a + 4; //Reassigning a = 7;
        a += 5; //Reassigning now a = 12;

        int z = 10;
        System.out.println("z = " + z++); //first use in this line, then increment
        z++;
        System.out.println("z = " + ++z);

        int x = 7;
        int y = x--;
        System.out.println(x);
        System.out.println(y);


    }
}
