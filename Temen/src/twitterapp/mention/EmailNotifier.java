package twitterapp.mention;

import twitterapp.tweet.User;

public class EmailNotifier extends NotifierDecorator {

    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void mention(String mentioner, User user) {
        System.out.println(mentioner + " mentioned " + user.getUsername() + "!");
        emailAlgorithm();
    }

    public void emailAlgorithm() {
        System.out.println("Email algorithm");
    }

}
