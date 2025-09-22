import java.util.*;

public class Calculator {

    // Methods for binary operations
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

    public static double modulus(double a, double b) {
        return a % b;
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    // Method for unary operation
    public static double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculations = true;

        System.out.println("Welcome to the Java Console Calculator!");

        while (continueCalculations) {
            double num1 = 0;
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
            System.out.println("Enter the operator (+, -, *, /, %, ^, sqrt) or 'exit' to quit:");
            String operator = sc.next().trim();

            if (operator.equalsIgnoreCase("exit")) {
                continueCalculations = false;
                System.out.println("Thank you for using the Calculator! Exiting...");
                break;
            }

            double result = 0;
            boolean validOperator = true;

            // Handle unary operation (sqrt)
            if (operator.equalsIgnoreCase("sqrt")) {
                if (num1 >= 0) {
                    result = squareRoot(num1);
                } else {
                    System.out.println("Error: Square root of a negative number is not allowed.");
                    continue;
                }
            } else {
                // Input for second number for binary operations
                double num2 = 0;
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

                // Process binary operators (case-insensitive)
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
                    case "%":
                        if (num2 != 0) {
                            result = modulus(num1, num2);
                        } else {
                            System.out.println("Error: Modulus by zero is not allowed.");
                            continue;
                        }
                        break;
                    case "^":
                        result = power(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid operator. Please use +, -, *, /, %, ^, or sqrt.");
                        validOperator = false;
                        continue;
                }
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