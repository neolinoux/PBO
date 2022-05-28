package ObserverPattern;
import java.util.ArrayList;

public class PinkBook implements Observable {
    private Boolean inStock = true;
    private ArrayList<Observer> customers;

    public PinkBook(Boolean inStock) {
        this.inStock = inStock;
        customers = new ArrayList<Observer>();
    }

    public Boolean isInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
        if(isInStock()) {
            notifyObservers();
        }
    }

    @Override
    public void addObserver(Observer o) {
        customers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        customers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < customers.size(); i++) {
            customers.get(i).update();
        }
    }
}
