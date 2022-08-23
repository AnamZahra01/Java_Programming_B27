package day39_inheritance.discordPQ3;

//Create an DiscordUser class
public class DiscordUser {
    //    - create variables:
    //        role, name, id
    String role;
    String name;
    int iD;

    //    - create constructor to initialize the variables
    public DiscordUser(String role, String name, int iD) {
        this.role = role;
        this.name = name;
        this.iD = iD;
    }

    //    - create a toString() method

    public String toString() {
        return "DiscordUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", iD=" + iD +
                '}';
    }
}
