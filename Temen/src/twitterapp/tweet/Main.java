package twitterapp.tweet;

import java.util.Date;

import twitterapp.mention.BasicNotifier;
import twitterapp.mention.EmailNotifier;
import twitterapp.mention.Notifier;
import twitterapp.mention.SMSNotifier;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();

        user1.setUsername("Yuzion");
        user2.setUsername("Effie");

        user1.follow(user2);
        user2.follow(user1);

        user1.postTweet(new TweetData(user1, new Date(), "MU kalah dari arsenal"));
        user1.postTweet(new TweetData(user1, new Date(), "MU kalah 1-3 dari arsenal"));

        user2.postTweet(new TweetData(user2, new Date(), "Arsenal menang dari MU"));

        Notifier notifier = new BasicNotifier();
        Notifier smsNotifier = new SMSNotifier(notifier);
        Notifier emailNotifier = new EmailNotifier(notifier);

        user1.setNotifiers(smsNotifier);
        user1.setNotifiers(emailNotifier);
        user2.setNotifiers(emailNotifier);
        //user2.setNotifiers(smsNotifier);
        user1.mention(user2);
        user2.mention(user1);
    }
}
