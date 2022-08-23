package day39_inheritance.discordPQ3;
//Create a class Admin - Admin class inherits DiscordUser class
public class Admin extends DiscordUser{

    //    - create constructor to call parent constructor and set up variables (role - Admin, name, id)

    public Admin( String name, int iD) {
        super("Admin", name, iD);
    }

    //- create method: createChannel()- Example output: prints Creating new discord channel
    public void createChannel(){
        System.out.println(name+ " is creating new discord channel");
    }
}
