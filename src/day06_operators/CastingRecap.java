package day06_operators;

public class CastingRecap {
    public static void main(String[] args) {

        int age = 40;
        long ageLong = age;
        System.out.println(ageLong);

        long num = 100;             //going int to long, 100 can fit into long. it is in the range.
        int numInt = (int)num;      //casting: Resolve the issue.
        System.out.println(numInt);

        long boxes = 3000000000L;   //here the number goes out of range of int, so we need to place it in long with L.

        float f = 14.5F;
        int i = (int) f;            // float --> int, bigger --> smaller, need casting.
        System.out.println(i);      //casting at the cost of data loss. we need to compile anyhow.data loss here.

        double d = f;               //float --> double, smaller --> bigger. All okay
        System.out.println(d);
        double d2 = i;              // int --> double, smaller --> bigger. All okay
        System.out.println(d2);
    }
}
