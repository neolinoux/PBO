package designpatterns.decorator.notifier;

/**
 *
 * @author user
 */
public class SlackNotifier extends NotifierDecorator{

    public SlackNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Send slack notification. Message: "+message);
        runSlackAlgorithm();
    }
    
    public void runSlackAlgorithm(){
        System.out.println("Run slack algorithm");
    }
    
}
