public class BankAccount {
    private double balance;
    private int accountID;
    private String password;

    public BankAccount(int id, String pass) {
        balance = 0;
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

    public boolean withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public String toString() {
        return "#" + getAccountID() + "\t" + "$" + getBalance();
    }

    private boolean authenticate(String password) {
        return password.equals(this.password);
    }

    
}