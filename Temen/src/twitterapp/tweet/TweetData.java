package twitterapp.tweet;

import java.util.Date;

public class TweetData {
    private String message;
    private Date date;
    private User sender;

    public TweetData(User sender, Date date, String message) {
        this.sender = sender;
        this.date = date;
        this.message = message;
    }

    @Override
    public String toString() {
        return " - Tweet from " + sender.getUsername() + " at " + date + " : " + message;
    }

}
