import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int secret = (int) (Math.random() * 100);
        Scanner scan = new Scanner(System.in);

        int number;

        int attempts = 0;
        do {
            System.out.print("Guess a number between 1 and 100: (to exit: press '-1'): ");
            number = scan.nextInt();
            if (number == -1)
                break;

            attempts++;

            if (number > secret) {
                System.out.println("Your number is greater than the secret value.");
            } else {
                System.out.println("Your number is less than the secret value.");
            }

        } while (number != secret);

        if (number == -1) {
            System.out.println("You exit the game.");
        } else {
            System.out.println("You hvae done it in " + attempts + " attempts.");
            System.out.println("The secret number was: " + secret);
        }
    }
}