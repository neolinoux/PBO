package Tugas.modul2;

public class Account {
    private int id;
    private String name;
    private int balance = 0;

    Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if(balance < amount) {
            System.out.println("Amount exceeded balance");
            return balance;
        }
        else{
            balance -= amount;
            return balance;
        }
    }

    public int transferTo(Account acc, int amount){
        if(balance < amount) {
            System.out.println("Amount exceeded balance");
        }
        else{
            balance -= amount;
            acc.balance += amount;
        }
        System.out.println(this.getName() +" melakukan transfer!\n" + "Sisa balance dari "+ this.getName() +" adalah "+this.balance);
        return balance;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Account ID: " + id + "\n" + "Account Name: " + name + "\n" + "Account Balance: " + balance;
    }
}
