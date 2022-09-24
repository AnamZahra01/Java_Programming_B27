package socialmedia;
/*
Fields:
 -Personal url (String), Account length (int), Platform (static String)
- Username, Password, Full name
Abstract Methods: - Direct messaging (String username, String message)
                   - Post (Object media)   [using Object type as the parameter]
                    - Notifications ()
 */
public abstract class SocialMedia {

    String personalUrl, userName, password, fullName;
    int accountLength;
    static String platform;

    public SocialMedia(String userName,String password){
        this.userName = userName;
        if (password.contains(userName)) {
            this.password = "12345";
            System.out.println("Password contained username. Default password created");
        } else {
            this.password = password;
            System.out.println("Password created");
        }
        this.personalUrl = "facebook.com/" + userName;
    }

    public abstract void directMessaging(String username, String message);
    public abstract void post(Post media);
    public abstract void notifications();

    @Override
    public String toString() {
        return "SocialMedia{" +
                "userName=" + userName +
                ", password=" + password  +
                '}';
    }
}
