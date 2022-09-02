package replit_tasks.oop;

public class Runner {
    public static void main(String[] args) {

        File file1 = new File("Lec1 Recording", 1.09);
        File file2 = new File("Lec2 Recording", 1.17);
        File file3 = new File("Lec3 Recording", 2.01);
        File file4 = new File("Lec4 Recording", 2.40);
        File file5 = new File("Lec5 Recording", 1.99);


        Module obj1 = new Module("All Files");
        obj1.addFile(file1);
        obj1.addFile(file2);
        obj1.addFile(file3);
        obj1.addFile(file4);
        obj1.addFile(file5);
        obj1.removeFile(file3);
        System.out.println(obj1.toString());
    }
}
