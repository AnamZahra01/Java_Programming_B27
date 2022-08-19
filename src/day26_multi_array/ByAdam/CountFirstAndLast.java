package day26_multi_array.ByAdam;

public class CountFirstAndLast {
    public static void main(String[] args) {


        String[] array = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet", "Asya"};
        //I need to get words one by one
        int count = 0;
        for (String name : array) {

            // I need to get first character
            String first = name.charAt(0) + "" ; //if we want to use string method we need change data type char to String
            //I need to get last character
            // it returns char          //if we add "" in order to make it String
            String last = name.charAt(name.length() - 1) + "";
            //if the characters are same count it
            if (first.equalsIgnoreCase(last)) {  //if you want to compare Upper Case and Lower Case we need to string method which is  equalsIgnoreCase()
                count++;
                System.out.println("name = " + name);
            }


        }
        System.out.println("count = " + count);

    }
}

