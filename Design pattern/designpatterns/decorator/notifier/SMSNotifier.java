package designpatterns.decorator.notifier;

/**
 *
 * @author user
 */
public class SMSNotifier extends NotifierDecorator {

    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Send sms notification. Message: " + message);
        runSMSAlgorithm();
    }

    public void runSMSAlgorithm() {
        System.out.println("Run SMS algorithm");
    }

}
