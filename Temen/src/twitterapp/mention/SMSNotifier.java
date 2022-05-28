package twitterapp.mention;

import twitterapp.tweet.User;

public class SMSNotifier extends NotifierDecorator {

    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void mention(String mentioner, User user) {
        System.out.println(mentioner + " mentioned " + user.getUsername() + "!");
        smsAlgorithm();
    }

    public void smsAlgorithm() {
        System.out.println("SMS algorithm");
    }

}
