import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters;

        // Input for measurement in meters
        do {
            System.out.print("Enter a measurement in meters: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter a measurement in meters: ");
                scanner.next();
            }
            meters = scanner.nextDouble();
        } while (meters < 0); // ensuring non-negative input

        // Convert meters to miles, feet, and inches
        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;

        // Display the results
        System.out.println("Equivalent measurement in miles: " + miles);
        System.out.println("Equivalent measurement in feet: " + feet);
        System.out.println("Equivalent measurement in inches: " + inches);

        scanner.close();
    }
}
