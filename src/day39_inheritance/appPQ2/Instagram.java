package day39_inheritance.appPQ2;

//    Create a class Instagram - Instagram class inherits App class
public class Instagram extends App {

    //  - create constructor to call parent constructor and set up variables (name and version)
    public Instagram(String name, int version) {
        super(name,  version);
    }

    //- create method: postPicture()
//    Example output: prints Posting picture to Instagram

    public void postPicture(){
        System.out.println("Posting Picture to Instagram");
    }

    }
