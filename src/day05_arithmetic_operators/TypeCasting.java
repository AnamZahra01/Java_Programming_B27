package day05_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {

        byte b = 14;
        int i = b; // int is bigger, so this is okay

        long l = 40; //by default 40 is int type, int can automatically be stored into a long because int is smaller than long.
        long l2 = 30000000000L; // 30000000000 is int by default, but it is too big for int type, so we need to tell compiler by using L.

        float f=10; //10 is int, float is bigger than int. Okay
        System.out.println(f);

        double d= 19.99;
        int i2 = (int)d; //int is smaller. so I need to cast to int.
        System.out.println(i2);

        int i3 = 500;
        byte b2 = (byte) i3; //byte is smaller than int. so we need to cast. going higher to lower makes data loss.
        System.out.println(b2); //-12

        short s = 68;
        double d3 = s; //auto
        System.out.println(d3);

        float f2 = 100.50F;
        int i4 = (int) f2; //int is smaller than float.
        System.out.println(i4);
        double l3 =  i4; //double is bigger than int, so yes. but we can't recover the lost data here.
        System.out.println(l3);


    }
}
