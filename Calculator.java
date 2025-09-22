import java.util.*;

public class Calculator {

    // Methods
    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculations = true;

        System.out.println("Welcome to the Java Console Calculator!");

        while (continueCalculations) {
            double num1 = 0, num2 = 0;
            boolean validInput = false;

            // Input for first number with exception handling
            while (!validInput) {
                System.out.println("Enter the first number:");
                try {
                    num1 = sc.nextDouble();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Please enter a valid number.");
                    sc.next(); // Clear invalid input
                }
            }

            // Input for operator
            System.out.println("Enter the operator (+, -, *, /) or 'exit' to quit:");
            String operator = sc.next().trim();

            if (operator.equalsIgnoreCase("exit")) {
                continueCalculations = false;
                System.out.println("Thank you for using the Calculator! Exiting...");
                break;
            }

            // Input for second number with exception handling
            validInput = false;
            while (!validInput) {
                System.out.println("Enter the second number:");
                try {
                    num2 = sc.nextDouble();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Please enter a valid number.");
                    sc.next(); // Clear invalid input
                }
            }

            double result = 0;
            boolean validOperator = true;

            // Process operator (case-insensitive)
            switch (operator.toLowerCase()) {
                case "+":
                    result = addition(num1, num2);
                    break;
                case "-":
                    result = subtraction(num1, num2);
                    break;
                case "*":
                    result = multiplication(num1, num2);
                    break;
                case "/":
                    if (num2 != 0) {
                        result = division(num1, num2);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Please use +, -, *, or /.");
                    validOperator = false;
                    continue;
            }

            if (validOperator) {
                // Format output to 2 decimal places
                System.out.printf("Result: %.2f\n", result);
                System.out.println("---------------------");
            }
        }
        sc.close();
    }
}