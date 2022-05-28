package designpatterns.decorator.notifier;

/**
 *
 * @author user
 */
public class FacebookNotifier extends NotifierDecorator{

    public FacebookNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Send facebook notification. Message: "+message);
        runFacebookAlgorithm();
    }
    
    public void runFacebookAlgorithm(){
        System.out.println("Run facebook algorithm");
    }
    
}
