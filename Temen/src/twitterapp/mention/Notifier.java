package twitterapp.mention;

import twitterapp.tweet.User;

public interface Notifier {
    public void mention(String mentioner, User user);
}
