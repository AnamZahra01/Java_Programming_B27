package day35_custom_classes.carpet;

public class CarpetObject {
    public static void main(String[] args) {


        Carpet kover = new Carpet(12.5, 35, 12.99, false);
        System.out.println(kover);

        Carpet persian= new Carpet(12.5, 35, 12.99, true);
        System.out.println(persian);
        System.out.println();

        persian.width = 16.5;
        persian.calculatePrice();
        System.out.println(persian);

        persian.length = 20.0;
        persian.calculatePrice();
        System.out.println(persian);


    }
}
