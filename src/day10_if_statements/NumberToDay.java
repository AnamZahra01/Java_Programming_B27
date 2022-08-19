package day10_if_statements;
public class NumberToDay {

/*
PQ-06:  Create a number to represent the day. (1 being Monday and 7 being Sunday)
        Print the day related to the number
    	Ex:	2
		    Tuesday
    	Ex: 5
		    Friday
 */
public static void main(String[] args) {
  int number = 7;

  if (number == 1){
      System.out.println("Monday");
  } else if (number == 2){
      System.out.println("Tuesday");
  } else if (number == 3){
      System.out.println("Wednesday");
  }else if (number == 4){
      System.out.println("Thurssday");
  }else if (number == 5){
      System.out.println("Friday");
  }else if (number == 6){
      System.out.println("Saturday");
  }else if (number == 7){
      System.out.println("Sunday");
  } else {                        // we can run else- if without else.
      System.out.println(number+ " is not a valid day number");
  }

}
}
