import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber;
        int userGuess;

        // Generate a random number between 1 and 10 inclusive
        randomNumber = random.nextInt(10) + 1;

        // Initialize user guess to a value outside the range to ensure it's different from the random number
        userGuess = 0;

        // Loop until the user provides a valid guess
        do {
            // Prompt the user to guess the number
            System.out.print("Guess the number (between 1 and 10): ");
            // Check if the input is an integer
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                System.out.print("Guess the number (between 1 and 10): ");
                scanner.next();
            }
            // Read the user's guess
            userGuess = scanner.nextInt();

            // Check if the guess is within the valid range
            if (userGuess < 1 || userGuess > 10) {
                System.out.println("Invalid guess. Please guess a number between 1 and 10.");
            }
        } while (userGuess < 1 || userGuess > 10);

        // Display the random number
        System.out.println("The random number is: " + randomNumber);

        // Check if the user's guess is correct, too high, or too low
        if (userGuess == randomNumber) {
            System.out.println("Congratulations! You guessed the number correctly!");
        } else if (userGuess < randomNumber) {
            System.out.println("Too low! The number was higher.");
        } else {
            System.out.println("Too high! The number was lower.");
        }

        scanner.close();
    }
}
