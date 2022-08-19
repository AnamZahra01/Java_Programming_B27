package day28_methods;

public class CurrencyConverterPQ3 {
    /*
    create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type
Use the following information to convert from given dollars to the desired currency type
1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee
Note: Don't worry about decimal formats, focus on method
Ex:     Input:	euro, 100
	    Output: 	91

Ex:     Input:  yen, 50
        Output: 6051.5
     */
    public static double currencyConverter(String amount , double dollar){
      double result = 0.0 ;
        switch (amount.toLowerCase()){

            case "euro":
                result = dollar * 0.91;
                break;
            case "yen":
                result = dollar * 121.03;
                break;
            case "lira":
                result = dollar * 14.85;
                break;
            case "won":
                result = dollar * 1_217.52;
                break;
            case "rupee":
                result = dollar * 181.45;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(currencyConverter("Euro", 100 ));
        System.out.println(currencyConverter("Yen", 50 ));
        System.out.println(currencyConverter("Rupee", 100 ));

    }
}
