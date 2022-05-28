package designpatterns.decorator.notifier;

/**
 *
 * @author user
 */
public class EmailNotifier extends NotifierDecorator {

    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Send email notification. Message: " + message);
        runEmailAlgorithm();
    }

    public void runEmailAlgorithm() {
        System.out.println("Run email algorithm");
    }

}
