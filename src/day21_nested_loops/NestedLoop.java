package day21_nested_loops;

public class NestedLoop {
    public static void main(String[] args) {
//for each iteration of outer loop, inner loop goes from beginning to end

        String store = "";
        for (int j = 0; j < 4; j++){ //4
            for (int i = 0; i < 3; i++) { //3
               System.out.println("Hello World");
            }
            store = ""+"Hello Universe";
           System.out.println(store);
        }
        System.out.println("anam");
    }
}
