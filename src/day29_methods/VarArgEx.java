package day29_methods;

public class VarArgEx {

    public static void main(String[] args) {
       int[] a = {3,1,3,5};
        printAll(a);
        System.out.println();
    //    printAll(2,1,3,4); not valid, because it is not an array
        dynamic(a); //this works
        System.out.println();
        dynamic(4,1,4,1,5,2);
        System.out.println();
        dynamic("monday", "hello", "java");
    }

    public static void printAll(int[] nums){
        for(int each : nums ){
            System.out.print(each + " ");
        }
    }

    //Alternative:

    public static void dynamic(int ... nums){
        for(int each : nums ){
            System.out.print(each + " ");
        }
    }

    public static void dynamic(String ... nums){
        for(String each : nums ){
            System.out.print(each + " ");
        }
    }

}
