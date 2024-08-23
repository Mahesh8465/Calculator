
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            try {
                // Get the first number
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                // Get the second number
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                // Display the operation menu
                System.out.println("Select an operation:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.print("Enter the number of the operation: ");
                int operation = scanner.nextInt();

                double result = 0;
                boolean validOperation = true;

                switch (operation) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    default:
                        System.out.println("Invalid operation selected.");
                        validOperation = false;
                        break;
                }

                if (validOperation) {
                    System.out.print("Do you want to perform another calculation? (yes/no): ");
                    String response = scanner.next();
                    if (response.equalsIgnoreCase("no")) {
                        continueCalculating = false;
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("Thank you for using the calculator. Goodbye!");
        scanner.close();
    }
}