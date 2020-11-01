public class Tester {
    public static void main(String[] ahhh) {
        BankAccount a = new BankAccount(2222, "VeryGoodPassword");
        BankAccount b = new BankAccount(2223, "GoodPassword");

        a.deposit(100);
        b.deposit(200);

        System.out.println("The following should all be \"true\":");
        System.out.println(a.getBalance() == 100);
        System.out.println(b.getBalance() == 200);
        System.out.println(a.transferTo(b, 100, "VeryGoodPassword"));
        System.out.println(a.getBalance() == 0);
        System.out.println(b.getBalance() == 300);
        System.out.println(!a.transferTo(b, 100, "VeryGoodPassword"));
        System.out.println(a.getBalance() == 0);
        System.out.println(b.getBalance() == 300);
        System.out.println(!b.transferTo(a, -100, "GoodPassword"));
        System.out.println(a.getBalance() == 0);
        System.out.println(b.getBalance() == 300);
        System.out.println(b.transferTo(a, 150, "GoodPassword"));
        System.out.println(a.getBalance() == 150);
        System.out.println(b.getBalance() == 150);
        System.out.println(!b.transferTo(a, 150, "BadPassword"));
        System.out.println(a.getBalance() == 150);
        System.out.println(b.getBalance() == 150);
    }
}