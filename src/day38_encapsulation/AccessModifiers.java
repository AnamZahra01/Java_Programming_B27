package day38_encapsulation;

public class AccessModifiers {

        public int a = 5;
        int b = 10; //default: with in  Package
        private int c = 20; //with in Class

    public static void main(String[] args) {
       AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }
}
