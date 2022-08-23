package day39_inheritance.appPQ2;

//    Create an App class
public class App {

//    - create variables: name (app name), version

     String name;
    int version;

//    - create constructor to initialize the variables

    public App(String name, int version) {
        this.name = name;
        this.version = version;
    }

    //    - create method: download() - Example output: prints $name is downloading version $version
    public void download(){
        System.out.println(this.name + " is downloading " + version);
    }

    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
