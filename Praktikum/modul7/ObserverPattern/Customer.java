package ObserverPattern;

public class Customer implements Observer {
    private Observable observable;
    private String username;

    public Customer(Observable observable, String username) {
        this.observable = observable;
        this.username = username;
    }
    
    @Override
    public void update() {
        System.out.println("Buku pink telah tersedia!");
    }

    private void buyDress() {
        System.out.println(username + " mendapatkan buku pink");
    }

    public void unsubscribe() {
        observable.removeObserver(this);
    }
}
