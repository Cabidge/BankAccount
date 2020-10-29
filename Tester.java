public class Tester {
    public static void main(String[] ahhh) {
        BankAccount a = new BankAccount(2222, "VeryGoodPassword");
        BankAccount b = new BankAccount(2223, "GoodPassword");
        a.deposit(100);
        b.deposit(200);
    }

    public static void printAccountInfo(BankAccount account) {
        System.out.print(account.toString());
    }
}