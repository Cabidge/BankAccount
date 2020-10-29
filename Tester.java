public class Tester {
    public static void main(String[] ahhh) {
        BankAccount account = new BankAccount(2222, "VeryGoodPassword");
    }

    public static void printAccountInfo(BankAccount account) {
        System.out.print(account.toString());
    }
}