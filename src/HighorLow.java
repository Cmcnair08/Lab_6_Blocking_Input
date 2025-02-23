import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
            Random random = new Random();
            int HighorLow = random.nextInt(10) + 1;
            Scanner scanner = new Scanner(System.in);
            int userGuess;

            do {
                System.out.print("Guess a number between 1 and 10: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("That is not a valid number, enter a number between 1 & 10. ");
                    scanner.next();
                }
                userGuess = scanner.nextInt();
            }while (userGuess < 1 || userGuess > 10 );
        System.out.println("The random number was: " + HighorLow);

            if (userGuess < HighorLow) {
                System.out.println("Your guess is too low. ");
            } else if (userGuess > HighorLow) {
                System.out.println("Your guess is too high. ");
            }else {
                System.out.println("Nice! You got it right! ");


            }
    scanner.close();
    }

    }

