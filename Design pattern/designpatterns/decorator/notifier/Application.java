package designpatterns.decorator.notifier;

/**
 *
 * @author user
 */
public class Application {
    Notifier notifier;

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }
    
    public void sendNotification(){
        this.notifier.send("Hallo...");
    }
}
