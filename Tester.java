public class Tester {
    public static void main(String[] ahhh) {
        BankAccount account = new BankAccount(20.20, 123, "VeryGoodPassword");
        System.out.print("Bank account has $");
        System.out.print(account.getBalance());
        System.out.print(" in its balance, and an id of ");
        System.out.println(account.getAccountID());
    }
}