package day34_custom_classes.house;

public class House {

    String type;
    double squareFeet;
    int numberOfBedrooms;
    int numberOfBathrooms;
    boolean inCity;
    boolean hasGarage;

    public double calculateMortgage(){
        if(numberOfBedrooms < 2){
            return 1500;
        } else if(numberOfBedrooms < 4){
            return 2000;
        } else {
            return 2500;
        }
    }

  /* original
   public String toString() { //command + N
        return "House{" +
                "type='" + type + '\'' +
                ", squareFeet=" + squareFeet +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", inCity=" + inCity +
                ", hasGarage=" + hasGarage +
                '}';
    }

   */

    public String toString() { //command + N
        return "House{" +
                "type='" + type + '\'' +
                ", squareFeet=" + squareFeet +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms + "," +
                (inCity? " In the city: " : " In the suburbs") +
                "," +
                (hasGarage? " Has garage" : " No garage, street parking"); //instead of true false, type message
    }
}
