package twitterapp.mention;

import twitterapp.tweet.User;

public class BasicNotifier implements Notifier {

    @Override
    public void mention(String mentioner, User user) {
        System.out.println(mentioner + " " + user.getUsername() + "!");
    }

}
