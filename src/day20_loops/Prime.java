package day20_loops;

public class Prime {
    public static void main(String[] args) {

        int number = 15; //11 P;
        boolean isPrime = true; //controlling boolean

        if(number < 2){
            System.out.println("Not PRime");
            System.exit(0);
        }

        for(int i = 2; i < number; i++){
            if (number % i == 0){
                isPrime = false;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime" );



    }
}
