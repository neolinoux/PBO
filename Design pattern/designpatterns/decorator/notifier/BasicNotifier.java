package designpatterns.decorator.notifier;

/**
 *
 * @author user
 */
public class BasicNotifier implements Notifier{

    @Override
    public void send(String message) {
        System.out.println("Send notification message: "+message);
    }
    
}
