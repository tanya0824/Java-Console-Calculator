# Java Console Calculator

A simple, user-friendly command-line calculator written in Java that performs basic arithmetic operations with intuitive operator-based input.

## Features

✨ **Core Operations:**
- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/)

🛡️ **Robust Error Handling:**
- Input validation for numbers
- Division by zero protection
- Invalid operator detection
- Graceful error recovery

🎯 **User Experience:**
- Intuitive operator-based input (type +, -, *, /)
- Continuous calculations until user exits
- Type "exit" at any time to quit
- Clean formatted output with 2 decimal places
- Clear error messages and prompts

## How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line terminal

### Steps
1. **Download the code:**
   ```bash
   git clone https://github.com/yourusername/java-console-calculator.git
   cd java-console-calculator
   ```

2. **Compile the program:**
   ```bash
   javac Calculator.java
   ```

3. **Run the calculator:**
   ```bash
   java Calculator
   ```

## Usage Example

```
Welcome to the Java Console Calculator!
Enter the first number:
15.5
Enter the operator (+, -, *, /) or 'exit' to quit:
*
Enter the second number:
2.5
Result: 38.75
---------------------
Enter the first number:
10
Enter the operator (+, -, *, /) or 'exit' to quit:
/
Enter the second number:
0
Error: Division by zero is not allowed.
Enter the first number:
10
Enter the operator (+, -, *, /) or 'exit' to quit:
exit
Thank you for using the Calculator! Exiting...
```

## Code Structure

The calculator is organized into clean, reusable methods:

- `addition(double a, double b)` - Performs addition
- `subtraction(double a, double b)` - Performs subtraction  
- `multiplication(double a, double b)` - Performs multiplication
- `division(double a, double b)` - Performs division
- `main(String[] args)` - Main program loop with input handling

## Error Handling

The calculator handles common errors gracefully:

- **Invalid number input:** Prompts user to re-enter valid numbers
- **Division by zero:** Shows error message and continues to next calculation
- **Invalid operators:** Alerts user to use valid operators (+, -, *, /)
- **Mixed input types:** Automatically clears invalid input and prompts again

## Technical Details

- **Language:** Java
- **Input Method:** Scanner class for console input
- **Loop Structure:** While loop for continuous calculations
- **Exception Handling:** Try-catch blocks for InputMismatchException
- **Output Formatting:** Printf for 2-decimal place formatting

---

*Happy calculating! 🧮*
