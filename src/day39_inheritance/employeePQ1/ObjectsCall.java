package day39_inheritance.employeePQ1;
//    Create objects of all three to see which variables and methods each object has access to
public class ObjectsCall {
    public static void main(String[] args) {
        Developer obj1 = new Developer("James", true, 100_000, false);
        System.out.println(obj1);
        obj1.work();
        obj1.develop();
        System.out.println();

        Tester obj2 = new Tester("Anam", true, 110_000, true);
        System.out.println(obj2);
        obj2.test();
        obj2.work();

    }
}
