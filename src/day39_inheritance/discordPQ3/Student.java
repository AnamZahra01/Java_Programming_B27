package day39_inheritance.discordPQ3;
//Create a class Student - Student class inherits DiscordUser class
public class Student extends DiscordUser{

    // - create constructor to call parent constructor and set up variables (role - Student, name, id)

    public Student(String name, int iD) {
        super("Student", name, iD);
    }

    //    - create method:sendMessage()- Example output: prints Sending message to class chat
    public void sendMessage(){
        System.out.println("Sending message to class chat");
    }
}
