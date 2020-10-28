public class BankAccount {
    private double balance;
    private int accountID;
    private String password;

    public BankAccount(double bal, int id, String pass) {
        balance = bal;
        accountID = id;
        password = pass;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountID() {
        return accountID;
    }
}