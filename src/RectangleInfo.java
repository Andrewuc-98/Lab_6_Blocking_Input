import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width;
        double height;

        // Input for width of the rectangle
        do {
            System.out.print("Enter the width of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter the width of the rectangle: ");
                scanner.next();
            }
            width = scanner.nextDouble();
        } while (width <= 0);

        // Input for height of the rectangle
        do {
            System.out.print("Enter the height of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter the height of the rectangle: ");
                scanner.next();
            }
            height = scanner.nextDouble();
        } while (height <= 0);

        // Calculate area
        double area = width * height;

        // Calculate perimeter
        double perimeter = 2 * (width + height);

        // Calculate length of diagonal using Pythagorean theorem
        double diagonal = Math.sqrt(width * width + height * height);

        // Display the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal of the rectangle: " + diagonal);

        scanner.close();
    }
}
