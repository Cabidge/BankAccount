public class Tester {
    public static void main(String[] ahhh) {
        BankAccount account = new BankAccount(20.20, 123, "VeryGoodPassword");

        printAccountInfo(account);

        System.out.println(account.deposit(24.33)); // True
        printAccountInfo(account); // 20.2 -> 44.53

        System.out.println(account.deposit(-3)); // False
        printAccountInfo(account); // 44.53
    }

    public static void printAccountInfo(BankAccount account) {
        System.out.print("Bank account has $");
        System.out.print(account.getBalance());
        System.out.print(" in its balance, and an id of ");
        System.out.println(account.getAccountID());
    }
}