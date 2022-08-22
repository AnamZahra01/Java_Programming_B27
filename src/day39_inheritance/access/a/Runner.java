package day39_inheritance.access.a;

public class Runner {
    public static void main(String[] args) {

        Condo condo = new Condo();
        condo.address = "1312 l";
        condo.city = "Chicago";
        condo.state = "IL";
       // condo.zipcode = "9123";  // private: accessible in same Class only


    }
}
