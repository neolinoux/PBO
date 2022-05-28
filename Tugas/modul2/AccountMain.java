package Tugas.modul2;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(1, "Budi", 1000000);
        Account account2 = new Account(2, "Yono", 1000000);

        System.out.println("ID: " + account.getId());
        System.out.println("Name: " + account.getName());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Credit: " + account.credit(1000000));
        System.out.println("Debit: " + account.debit(1000000));

        System.out.println("ID: " + account2.getId());
        System.out.println("Name: " + account2.getName());
        System.out.println("Balance: " + account2.getBalance());
        System.out.println("Credit: " + account2.credit(1000000));
        System.out.println("Debit: " + account2.debit(1000000));

        System.out.println("Transfer to: " + account.transferTo(account2, 1000000));
        System.out.println(account.toString());
        System.out.println(account2.toString());
    }
}
