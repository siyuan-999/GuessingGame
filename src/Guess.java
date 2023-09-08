import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber;

        do {
            secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");

            int attempts = 0;
            int guess;

            do {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Try a higher number.");
                } else if (guess > secretNumber) {
                    System.out.println("Try a lower number.");
                }
            } while (guess != secretNumber);

            System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts.");

            System.out.print("Do you want to play again? (1=yes, 2=no): ");
            int playAgain = scanner.nextInt();

            if (playAgain != 1) {
                break;
            }

        } while (true);

        System.out.println("Thanks for playing!");
    }
}
