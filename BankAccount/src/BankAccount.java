import java.util.Scanner;

public class BankAccount {
    String accName = "Huzaifa";
    final String accIBAN;
    double accBalance = 500;

    public BankAccount() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        this.accName = scan.nextLine();
        System.out.print("Enter your IBAN: ");
        this.accIBAN = scan.nextLine();
        System.out.println("Enter your account balance: ");
        this.accBalance += scan.nextDouble();
    }
}
