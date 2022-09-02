package day40_inheritance.olympic_sportPQ3;

public class RunOlympicSport {
    public static void main(String[] args) {

        Surfing obj1 = new Surfing(11);
        System.out.println(obj1);
        obj1.complete();
        System.out.println();

        Track obj2 = new Track(15);
        System.out.println(obj2);
        obj2.complete();
        System.out.println();

        Soccer obj3 = new Soccer(12);
        System.out.println(obj3);
        obj3.complete();
        System.out.println();

    }
}
