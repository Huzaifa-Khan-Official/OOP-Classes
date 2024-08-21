public class App {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        System.out.println("------------------------------------");
        System.out.println("Successfully created your account:");
        System.out.println("Account holder's name: " + account1.accName);
        System.out.println("Account IBAN: " + account1.accIBAN);
        System.out.println("Initial account balance: " + account1.accBalance);
    }
}