package day39_inheritance.appPQ2;

//    Create a class YouTube - YouTube class inherits App class
public class YouTube extends App{

    //    - create constructor to call parent constructor and set up variables (name and version)

    public YouTube(String name, int version) {
        super(name, version);
    }
    //    - create method: watchVideo()
//    Example output: prints Watching java tutorial
    public void watchVideo(){
        System.out.println("Watching Java Tutorial");
    }

}
