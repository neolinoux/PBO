public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    int getCostumerID(){
        return customer.getId();
    }

    String getCustomerName(){
        return customer.getName();
    }

    int getCustomerDiscount(){
        return customer.getDiscount();
    }

    double getAmountAfterDiscount(){
        return amount - (amount * customer.getDiscount() / 100);
    }

    @Override
    public String toString() {
        return "Invoice[id=" + id + ", customer=" + customer.getName() + "(" + id + ") (" + customer.getDiscount() +")" + ", amount=" + amount + "]";
    }
}
