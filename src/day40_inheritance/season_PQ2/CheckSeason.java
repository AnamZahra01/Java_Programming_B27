package day40_inheritance.season_PQ2;

//Create a class CheckSeason
public class CheckSeason {
    public static void main(String[] args) {

        Winter obj1 = new Winter( 10, -20);
        System.out.println(obj1);
        System.out.println(obj1.activity());
        System.out.println();

        Summer obj2 = new Summer( 100, 30);
        System.out.println(obj2);
        System.out.println(obj2.activity());
        System.out.println();

        Fall obj3 = new Fall( 70, 40);
        System.out.println(obj3);
        System.out.println(obj3.activity());
        System.out.println();

        Spring obj4 = new Spring( 65, 45);
        System.out.println(obj4);
        System.out.println(obj4.activity());
        System.out.println();
    }
}
