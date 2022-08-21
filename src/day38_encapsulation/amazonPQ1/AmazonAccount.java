package day38_encapsulation.amazonPQ1;

//Create a class AmazonAccount

public class AmazonAccount {

//    instance variables:  - userName (String)  - email (String) - hasPrime (boolean)

    private String userName;
    private  String email;
    private boolean hasPrime;

//    constructor:
//        - initialize the fields

    public AmazonAccount(String userName, String email, boolean hasPrime) {
        setUserName(userName);
        setEmail(email);
        setHasPrime(hasPrime);
    }

//    encapsulate AmazonAccount

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(userName.contains(" ")) {
            this.userName = userName;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains(".com")){
            this.email = email;
        }
    }

    public boolean isHasPrime() {
        return hasPrime;
    }

    public void setHasPrime(boolean hasPrime) {
            this.hasPrime = hasPrime;
    }


//    methods: toString()

    public String toString() {
        return "AmazonAccount{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", hasPrime=" + hasPrime +
                '}';
    }

}
