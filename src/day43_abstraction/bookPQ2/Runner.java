package day43_abstraction.bookPQ2;

public class Runner {
    public static void main(String[] args) {

        JavaTextBook obj1 = new JavaTextBook("Java", 1.09, true);
        obj1.open();
        obj1.read();
        obj1.download();
        System.out.println(obj1.name);

    }
}
