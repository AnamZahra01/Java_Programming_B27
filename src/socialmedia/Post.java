package socialmedia;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*instance variable:
        String body, and String dateTime

 */
public class Post {
    private String body;
    private final String dateTime;

    /*
    - Encapsulate body. Provide a public getter and setter
- Make dateTime final, private, read only (getter, but no setter)

     */



    public Post(String body) {
        setBody(body);
        this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Post{" +
                "body='" + body + '\'' +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}
