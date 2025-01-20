
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Take inputs for the two numbers
    System.out.print("Enter the first number (a): ");
    double a = scanner.nextDouble();

    System.out.print("Enter the second number (b): ");
    double b = scanner.nextDouble();

    // Display operation choices
    System.out.println("Choose an operation:");
    System.out.println("1: + (Addition)");
    System.out.println("2: - (Subtraction)");
    System.out.println("3: * (Multiplication)");
    System.out.println("4: / (Division)");
    System.out.println("5: % (Modulo or Remainder)");

    // Take input for the operation
    System.out.print("Enter the operation number (1-5): ");
    int operation = scanner.nextInt();

    // Perform the chosen operation
    double result;
    switch (operation) {
        case 1:
            result = a + b;
            System.out.println("Result: " + a + " + " + b + " = " + result);
            break;

        case 2:
            result = a - b;
            System.out.println("Result: " + a + " - " + b + " = " + result);
            break;

        case 3:
            result = a * b;
            System.out.println("Result: " + a + " * " + b + " = " + result);
            break;

        case 4:
            if (b != 0) {
                result = a / b;
                System.out.println("Result: " + a + " / " + b + " = " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
            break;

        case 5:
            if (b != 0) {
                result = a % b;
                System.out.println("Result: " + a + " % " + b + " = " + result);
            } else {
                System.out.println("Error: Modulo by zero is not allowed.");
            }
            break;

        default:
            System.out.println("Error: Invalid operation number. Please enter a number between 1 and 5.");
    }

    // Close the scanner
    scanner.close();
}
}
