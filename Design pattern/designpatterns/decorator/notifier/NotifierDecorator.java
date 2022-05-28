package designpatterns.decorator.notifier;

/**
 *
 * @author user
 */
public class NotifierDecorator implements Notifier{

    Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
    
    @Override
    public void send(String message) {
        this.notifier.send(message);
    }
    
}
