package day40_inheritance.parent;

class Child extends Parent {
    //    @Override : static variables cannot override
    public static void hello() { // when I make this method, I am hiding the one from the parent
        System.out.println("Hello from Child");
    }
}
