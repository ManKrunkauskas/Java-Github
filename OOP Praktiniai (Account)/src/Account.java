import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private String name;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.annualInterestRate = 0; // Default 0
        this.dateCreated = new Date();
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount, String description) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, description));
    }

    public boolean withdraw(double amount, String description) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return false;
        }
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, description));
        return true;
    }

    public void printSummary() {
        System.out.println("Account Summary:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Balance: " + balance);
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Transactions:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
