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

    public void setPassword(String pass) {
        password = pass;
        //System.out.println("Password changed to " + pass); // For testing
    }

    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        }
        balance += amount;
        return true;
    }
}