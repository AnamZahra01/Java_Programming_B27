package day14_string;

public class Quiz {

    public static void main(String[] args) {
        String s = "I will find the lost book";
        String word = "Reverse";

        for (int i = s.length() - 1; i <= 0; i--) {
            word += s.charAt(i);
            
        }
        System.out.println(word);


//        String str = "cydeo";
//        for (int i = 0; i <= str.length() ; i +=3) {
//            System.out.println(str.charAt(i));
//        }


//        double [] nums = new double[4];
//        nums[0] = 10.5;
//        nums[2] = 20.5;
//        nums = new double[4]; //updated array here, nums = [0.0, 0.0, 0.0, 0.0];
//        nums[1] = 13.99;
//        nums[3] = nums.length;
//        System.out.println(Arrays.toString(nums));


//        String str = "hello";
//        for (int i = 0; i < str.length()-1 ; i ++) { //i<str.length-1 -> 3 so i = 0,1,2,3
//            System.out.println(str.substring(i, i+2));
//        }


    }

}
