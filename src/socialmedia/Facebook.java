package socialmedia;

import java.util.ArrayList;
public class Facebook extends SocialMedia{
//TODO : 2 tasks incomplete
    private int age;
    private int numberOfFriends;
    private ArrayList<Post> posts;

    public Facebook(String userName, String password) {
        super(userName, password);
        // Create and assign user's person url by using 'facebook.com/' and adding their username at the end
        //Create an empty ArrayList of Posts
        this.posts = new ArrayList<Post>();
    }

    //Overload the constructor to accept the username, password, and the user’s name
    public Facebook(String userName, String password, String fullName){
        this(userName, password);

        char[] fullNameArr = fullName.toCharArray();
       // boolean isAlphabet = true;
        for(char each : fullNameArr) {
            if (!Character.isLetter(each)) {
                this.fullName = "No Name";
                System.out.println("InValid Name");
                 //isAlphabet = false;
                break;
            } else {
                this.fullName = fullName;
            }
        }
    }

    public Facebook(String userName, String password, String fullName, int age, int numberOfFriends){
        this(userName,password,fullName);
        setAge(age);
        setNumberOfFriends(numberOfFriends);
    }

    //- The age cannot be a negative number
    //- The number of friends cannot be negative or more than 5000.
    //getter and setter for age and numberOfFriends

    public void setAge(int age) {
        if(age >= 0){
            this.age = age;
        }else{
            this.age = 0;
            System.out.println("InValid Age");
        }
    }
    public void setNumberOfFriends(int numberOfFriends) {
        if(numberOfFriends < 0 || numberOfFriends > 5000){
            this.numberOfFriends = 0;
            System.out.println("InValid Number Of Friends");
        }else {
            this.numberOfFriends = numberOfFriends;
        }
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    //-----------------------Methods----------------

    @Override
    public void directMessaging(String userName, String message){
        System.out.println("Message sent to " + userName);
    }


//TODO: Revise this part

    public void addPost(Post newPost){
        posts.add(new Post("Pic1"));
    }

    @Override
    public void post(Post post){
       // posts.add(post);
    }


    public ArrayList<Post> getPosts() {
        return posts;
    }
    //------------------------------------------------

    @Override
    public void notifications() {
        //ToDo: Checks the current time. If the time is between 8 am - 5 pm print "Notification", otherwise print "Sleep mode"
        //if(){

      // }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Facebook{" +
                "age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", posts=" + posts +
                ", personalUrl='" + personalUrl + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", accountLength=" + accountLength +
                '}';
    }
}
