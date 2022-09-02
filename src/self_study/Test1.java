package self_study;

public class Test1 {
    public static void main(String[] args) {
        double n = add(3.5);
        n+=add("true");

        n+=add(10);
        n+=add(false);
        System.out.println(n);

    }
    public static int add(int n){
return 1;
    }

    public static double add(double d){
        return 1.5;
    } public static int add(String s){
        return s.length();
    } public static int add(boolean b){
        return 5;
    }
}
