package day32_arraylist;

import my_utils.EasyData;

import java.util.ArrayList;

public class TestRandomData {

    public static void main(String[] args) {

        System.out.println(EasyData.getRandomNumbers(5));

        ArrayList<Integer> nums = EasyData.getRandomNumbers(2);
        System.out.println(nums);

    }
}
