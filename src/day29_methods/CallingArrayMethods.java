package day29_methods;

import my_utils.ArrayUtil;

import java.util.Arrays;

public class CallingArrayMethods {
    public static void main(String[] args) {

        int num = ArrayUtil.minInArray(4,2,1,5,1,-1,2,5,2,-1,5);
        System.out.println(num);
        System.out.println(ArrayUtil.minInArray(5,3,7,5,2,5,2,5));

        System.out.println(ArrayUtil.maxInArray(5,3,4,5,2,5,8));
        int[] a = {45,2,6,2,23,83,12};
        System.out.println(ArrayUtil.maxInArray(a));
        System.out.println(ArrayUtil.maxInArray(new int[]{4,15,2,5,2}));

        int[] b = {4,5,12,5,14};
        System.out.println(ArrayUtil.contains(b,13));
        System.out.println(ArrayUtil.contains(b,5));

        int[] c = {4,2,5,1,5,6};
        System.out.println(ArrayUtil.indexNum(c,5));
        System.out.println(ArrayUtil.indexNum(c,7));

        System.out.println();
        int[]d = {4,5,1,6,1,6,3,5,4,1};
        System.out.println("Overloaded use: "+ArrayUtil.indexNum(d,6));
        System.out.println("Overloaded use: "+ArrayUtil.indexNum(d,6,4));

        //Dynamic
        int firstIndex = ArrayUtil.indexNum(d,6);
        int secondIndex = ArrayUtil.indexNum(d,6, firstIndex+1);
        System.out.println(secondIndex);
        System.out.println("----------------");

        String[] words = {"java", "is","the","best"};
        String[] allWords = ArrayUtil.addElement(words,"language");
        System.out.println(Arrays.toString(allWords));


        String[] arr1 = {"today", "is", "monday"};
        String[] arr2 = {"no", "soft-skills", "today"};
        String[] output = ArrayUtil.addElement(arr1,arr2);
        System.out.println(Arrays.toString(output));
    }
}
