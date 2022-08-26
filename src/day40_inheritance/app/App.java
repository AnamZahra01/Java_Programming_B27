package day40_inheritance.app;

public class App {
    String name; double version;

    //constructor -> to initialize ins.var
    public App(String name, double version) {
        this.name = name;
        this.version = version;
    }

    //ins.method
    public void download(){
        System.out.println(name + " is downloading version " + version);
    }

}
