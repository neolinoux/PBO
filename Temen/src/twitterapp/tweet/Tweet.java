package twitterapp.tweet;

public class Tweet {
    public Tweet() {
        System.out.println("Loading tweet...");
    }

    public void execute(String content) {
        if (content.length() > 248 || content.length() < 1) {
            System.out.println("Tweet length must be between 1 and 248 characters.");
        } else {
            System.out.println(content);
        }
    }
}
