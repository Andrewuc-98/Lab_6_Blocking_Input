import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        do {
            // Prompt the user to enter temperature in Celsius
            System.out.print("Enter temperature in Celsius (C): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter temperature in Celsius: ");
                scanner.next();
            }
            celsius = scanner.nextDouble();

            if (celsius < -273.15) {
                System.out.println("Invalid input. Temperature cannot be below absolute zero (-273.15°C).");
            }
        } while (celsius < -273.15); // Loop until a valid temperature is entered

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println("Equivalent temperature in Fahrenheit (F): " + fahrenheit);

        scanner.close();
    }
}