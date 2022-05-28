package nomor6;

import java.sql.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense, productExpense;

    Visit(String name, Date date){
        this.customer = new Customer(name);
        this.date = date;
    }

    String getName(){
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        if(customer.isMember()){
            double totalservice, totalproduct;
            totalservice = serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType()));
            totalservice = totalservice - (totalservice * 0.1);
            totalproduct = productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType()));
            totalproduct = totalproduct - (totalproduct * 0.1);
            return totalservice + totalproduct;
        }
        else{
            return (serviceExpense - (serviceExpense * 0.1) + (productExpense - (productExpense * 0.1)));
        }
    }

    @Override
    public String toString() {
        if(customer.isMember()){
            return "Customer Name: " + customer.getName() + "\n" +
                    "Member Type: " + customer.getMemberType() + "\n" +
                    "Date: " + date + "\n" +
                    "Service Expense: " + serviceExpense + "\n" +
                    "Product Expense: " + productExpense + "\n" +
                    "Total Expense: " + getTotalExpense();
        }
        else{
            return "Customer Name: " + customer.getName() + "\n" +
                    "Date: " + date + "\n" +
                    "Service Expense: " + serviceExpense + "\n" +
                    "Product Expense: " + productExpense + "\n" +
                    "Total Expense: " + getTotalExpense();
        }
    }
}
