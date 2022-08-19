package coding_bat_tasks;

public class StringEndsWith {
    public static boolean endsLy(String str) {
        if (str.endsWith("ly")) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        System.out.println(endsLy("oddly"));
    }
}
