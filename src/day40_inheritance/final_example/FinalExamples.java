package day40_inheritance.final_example;

public final class FinalExamples {
    public final int a = 10; // hard coded instance variable
    public final int b;

    public static final String PLANET = "Earth";

    public static final String TEST_1 = "test1.us.google.com";
    // public static final -> these keywords together is what makes a constant

    public FinalExamples(int num) {
        b = num; // when the object is created, the given argument will be the value of b, then it cannot be changed
    }
}
