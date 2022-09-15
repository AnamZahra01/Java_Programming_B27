package day44_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {

        // Lizard objects with all references

        // reference of itself
        Lizard lizard1 = new Lizard();
        lizard1.eat(); //Eating from LIZARD

        // reference of super class
        Reptile lizard2 = new Lizard();
        lizard2.eat(); //Eating from LIZARD

        Animal lizard3 = new Lizard();
        lizard3.eat(); //Eating from LIZARD
    }
}
