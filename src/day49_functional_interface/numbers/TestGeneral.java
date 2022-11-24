package day49_functional_interface.numbers;

public class TestGeneral {
    public static void main(String[] args) {

        GeneralInterface<Integer> validYear = (year) -> {
            if(year >= 0 && year <= 2022){
                System.out.println(year + " is valid");
            }else{
                System.out.println(year + " is invalid");
            }
        };
        validYear.test(2000);
        System.out.println("==============");
        GeneralInterface<String> eachChar = (str) -> {
            for(int i = 0; i < str.length(); i++){
                System.out.println(str.charAt(i));
            }
        };
        eachChar.test("Anam");

    }
}
