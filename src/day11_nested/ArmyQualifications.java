package day11_nested;
/*
ages: 18 -35
high school diploma
citizen
 */

/*
in our program we check if you are eligible and show the message if you are, but then if you are not we go through 3 if statements to check the reason why. They are separate if statements that check about valid age, diploma and citizenship.
 */
public class ArmyQualifications {
    public static void main(String[] args) {

        int age = 200;
        boolean hasDiploma = false;
        boolean isCitizen = false;

        if ((age >= 18 && age <= 35) && hasDiploma && isCitizen){
            System.out.println("You Qualify for Army");
        } else {

            //multi branch to give information about age
            if(age < 0 || age > 120){   //checks for valid age numbers first
                System.out.println("Not a Valid Age number");
            } else if (age < 18) {
                System.out.println("You are too young, need to be at least 18");
            } else if(age > 35){
                System.out.println("You are too old, limit is 35 years old");
            }

            //if to check about diploma
            if (!hasDiploma){   //if you dont have a diploma then:
                System.out.println("You need at least a high school diploma");
            }

            //if to check about citizenship
            if(!isCitizen){     //if you dont have citizenship then:
                System.out.println("You need to be a citizen to apply");
            }
        }

    }
}
