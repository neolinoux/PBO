package nomor6;

import java.sql.Date;

public class TestDiscount {
    public static void main(String[] args) {
        Customer customer = new Customer("Budi");
        customer.setMember(true);
        customer.setMemberType("Gold");
        Visit visit = new Visit(customer.getName(), new Date(2019, 10, 10));
        visit.setServiceExpense(10000);
        visit.setProductExpense(10000);
        System.out.println(visit);
        Customer customer2 = new Customer("Siti");
        customer2.setMember(false);
        Visit visit2 = new Visit(customer2.getName(), new Date(2019, 10, 10));
        visit2.setProductExpense(10000);
        visit2.setServiceExpense(10000);
        System.out.println(visit2);
    }
}
