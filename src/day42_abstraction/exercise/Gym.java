package day42_abstraction.exercise;

public class Gym {
    public static void main(String[] args) {
        //Exercise = abstract -> can not make object from it

        Running obj = new Running();
        obj.perform();obj.getCaloriesBurned(30);

        //Lifting -> abstract = no objects instantiated

        Bench obj2 = new Bench();
        obj2.perform();
        obj2.getCaloriesBurned(20);
        obj2.rackWeights();
    }
}
