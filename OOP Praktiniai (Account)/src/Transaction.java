import java.util.Date;

public class Transaction {
    private Date date;
    private char type; // 'D' for deposit, 'W' for withdrawal
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {
        return date + " | " + type + " | " + amount + " | Balance: " + balance + " | " + description;
    }
}
