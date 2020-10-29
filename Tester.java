public class Tester {
    public static void main(String[] ahhh) {
        BankAccount account = new BankAccount(2222, "VeryGoodPassword");
        System.out.println("Testing Passwords:");
        System.out.println("Expect True: " + account.authenticate("VeryGoodPassword"));
        System.out.println("Expect False: " + account.authenticate("VeryBadPassword"));
        account.setPassword("VeryBadPassword");
        System.out.println("Expect True: " + account.authenticate("VeryBadPassword"));
    }

    public static void printAccountInfo(BankAccount account) {
        System.out.print(account.toString());
    }
}