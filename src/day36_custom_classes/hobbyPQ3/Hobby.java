package day36_custom_classes.hobbyPQ3;

//  create a class called Hobby
public class Hobby {

//        - data: name, annual cost, is outdoors (boolean), requires others (boolean)
    String name;
    double annualCost;
    boolean outDoor;
    boolean requireOthers;
//   - constructor  - create a constructor that creates a Hobby object with the name

    public Hobby(String name) {
        this.name = name;
    }

//   - create a constructor that creates a Hobby object with the name and annual cost

    public Hobby(String name, double annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

//    - create a constructor that creates a Hobby object with the name, annual cost, is outdoors, and requires others

    public Hobby(String name, double annualCost, boolean outDoor, boolean requireOthers) {
        this(name, annualCost);
        this.outDoor = outDoor;
        this.requireOthers = requireOthers;
    }

//        - method: - doIt():  print: Doing $name-of-hobby $outside-or-inside
//                    ex: new Hobby("golf", 100, true, false).doIt() -> Doing golf outside
//                    ex: new Hobby("puzzles", 50, false, true).doIt() -> Doing puzzles inside

    public void doIt(){
        if(outDoor) {
            System.out.println("Doing " + name + " out door") ;
        } else {
            System.out.println("Doing " + name + " in door") ;

        }
    }

//            - toString() print all the Hobby information

    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", outDoor=" + outDoor +
                ", requireOthers=" + requireOthers +
                '}';
    }
}
