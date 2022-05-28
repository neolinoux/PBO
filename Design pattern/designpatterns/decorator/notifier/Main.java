package designpatterns.decorator.notifier;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        
        boolean emailEnabled = true;
        boolean smsEnabled = true;
        boolean facebookEnabled = false;
        boolean slackEnabled = false;
        
        Notifier notifier = new BasicNotifier();
        
        if(emailEnabled) 
            notifier = new EmailNotifier(notifier);
        
        if(smsEnabled) 
            notifier = new SMSNotifier(notifier);
        
        if(facebookEnabled) 
            notifier = new FacebookNotifier(notifier);
        
        if(slackEnabled) 
            notifier = new SlackNotifier(notifier);
        
        app.setNotifier(notifier);
        app.sendNotification();
        
        
        
    }
}
