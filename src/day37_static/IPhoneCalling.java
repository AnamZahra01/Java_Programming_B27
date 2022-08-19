package day37_static;

public class IPhoneCalling {
    public static void main(String[] args) {

        IPhone iPhone1 = new IPhone("IPhone X", "Black", 1000, 256);
        System.out.println(iPhone1);

        System.out.println(IPhone.os);
        System.out.println(IPhone.brand);

        System.out.println();
        IPhone iPhone2 = new IPhone("IPhone 7", "Silver", 1000, 256);
        System.out.println(iPhone2);
    }
}
