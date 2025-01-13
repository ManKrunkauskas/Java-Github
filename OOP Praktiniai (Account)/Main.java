public class Main {
    public static void main(String[] args) {
        Account account = new Account(1122, "George", 1000);

        // Perform transactions
        account.deposit(30, "Deposit $30");
        account.deposit(40, "Deposit $40");
        account.deposit(50, "Deposit $50");
        account.withdraw(5, "Withdraw $5");
        account.withdraw(4, "Withdraw $4");
        account.withdraw(2, "Withdraw $2");

        // Print account summary
        account.printSummary();
    }
}
