import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallonsOfGas;
        double fuelEfficiency;
        double pricePerGallon;

        // Input for number of gallons of gas in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter the number of gallons of gas in the tank: ");
                scanner.next();
            }
            gallonsOfGas = scanner.nextDouble();
        } while (gallonsOfGas <= 0);

        // Input for fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter the fuel efficiency in miles per gallon: ");
                scanner.next();
            }
            fuelEfficiency = scanner.nextDouble();
        } while (fuelEfficiency <= 0);

        // Input for price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter the price of gas per gallon: ");
                scanner.next();
            }
            pricePerGallon = scanner.nextDouble();
        } while (pricePerGallon <= 0);

        // Calculate cost per 100 miles
        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;

        // Calculate distance the car can go with the gas in the tank
        double distance = gallonsOfGas * fuelEfficiency;

        // Display the results
        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("Distance the car can go with the gas in the tank: " + distance + " miles");

        scanner.close();
    }
}
