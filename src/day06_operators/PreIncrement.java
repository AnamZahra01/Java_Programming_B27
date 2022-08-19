package day06_operators;
/*
PQ-03.  What is the value of a and b
                    int a = 8;
                    int b = a--;
        What is a? What is b?
        ------------------------------------------
        Self study (Points to remember):
            sym++ = first use it then increment.
            ++sym = first increment then use.
 */

public class PreIncrement {
    public static void main(String[] args) {
        int a = 8;
        int b = a-- ;       // b = 8, a = 7

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("---------------------");

        a = b = 15;      // a = 16, b = 16
        a = ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("---------------------");

         a = b = 15;      // a = 15, b = 16
        a = b++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("---------------------");

        int x = 1;      // 1 (2) + (3) 3 + 3 (4) + 5 + 6 = 18
        x = x++ + ++x + x++ + ++x + ++x;
        System.out.println("Value of x : " + x);
        System.out.println("---------------------");

        a = 5;
        int i;
        i = ++a + ++a + a++;        // 6 + 7 + 7 (a becomes 8 in next step) => i = 20
        i = a++ + ++a + ++a;        // 8 (9) + 10 + 11 => i = 29
        a = ++a + ++a + a++;        // 12 + 13 + 13 (14) => a = 38
        System.out.println("a = " + a + ", i = " +i);
        System.out.println("---------------------");

        a = 5;
        b = 2;
        int c , d;
        c = ++b;        // c = 3, b = 3
        d = a++;        // d = 5, a = 6
        c++;            // c = 4
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

    }
}
