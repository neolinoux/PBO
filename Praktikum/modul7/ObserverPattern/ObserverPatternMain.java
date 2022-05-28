package ObserverPattern;

public class ObserverPatternMain {
    public static void main(String[] args) {
        PinkBook pinkBook = new PinkBook(true);

        Customer customer1 = new Customer(pinkBook, "Budi");
        pinkBook.addObserver(customer1);

        Customer customer2 = new Customer(pinkBook, "Siti");
        pinkBook.addObserver(customer2);

        pinkBook.setInStock(true);
    }
}
