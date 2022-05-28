package twitterapp.mention;

import twitterapp.tweet.User;

public class NotifierDecorator implements Notifier {
    private Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void mention(String mentioner, User user) {
        notifier.mention(mentioner, user);
    }
}
