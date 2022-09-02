package replit_tasks.oop;
import java.util.ArrayList;

public class Module {
    String name;
    ArrayList<File> list = new ArrayList<>();
    public Module(String name){
        this.name = name;
    }
    public Module(String name, ArrayList<File> list){
        this(name);
        this.list = list;
    }
    public void addFile(File newFile){
        list.add(newFile);
    }
    public void removeFile(File newFile){
        list.removeIf(p -> (p.name.equalsIgnoreCase(newFile.name) && (p.size == newFile.size)) );
    }

    public  String toString(){
        return name+ "\nFiles:\n"+list;
    }
}
