package day38_encapsulation;

public class FlightTicket {
    //declare instance variables: type(first, business, economy)
    //departure, arrival

    private String type;
    private String departureLocation;
    private String arrivalLocation;

    public FlightTicket(String type, String departureLocation, String arrivalLocation) {
        setType(type);
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type.equals("first") || type.equals("business") || type.equals("economy")) {
            this.type = type;
        }
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }
}
