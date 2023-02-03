package by_rreze.checkCodes;

import java.util.*;

public class DescendByBaz {
    public static void sortArrayListDes(List<Integer> listDes) { //(200, 101, 201, 500, 100)
        Set<Integer> finalSort = new TreeSet<>(listDes);
        List<Integer> result = new ArrayList<>(finalSort);
        List<Integer> result2 = new ArrayList<>();
        for (int i = result.size()-1; i >= 0; i--) {
            result2.add(result.get(i));
        }
        System.out.println(result2);

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(200, 101, 201, 500, 100));
        sortArrayListDes(list);
    }
}
