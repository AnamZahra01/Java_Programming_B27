package day38_encapsulation;

public class Airport {
    public static void main(String[] args) {

        FlightTicket ticket1 = new FlightTicket("first", "Chicago", "Virginia");
        System.out.println(ticket1.getType());
        System.out.println(ticket1.getArrivalLocation());
        System.out.println(ticket1.getDepartureLocation());

    }
}
