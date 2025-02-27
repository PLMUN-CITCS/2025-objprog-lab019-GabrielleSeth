import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Step 1: Get a valid non-negative integer from the user
        int number = getNonNegativeInteger();
        
        // Step 2: Calculate the factorial
        long factorial = calculateFactorial(number);
        
        // Step 3: Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Method to get a valid non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            try {
                System.out.print("Enter a non-negative integer: ");
                number = Integer.parseInt(scanner.nextLine()); // Read and parse input
                
                if (number < 0) {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                } else {
                    break; // Exit loop if valid input
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        scanner.close();
        return number;
    }

    // Method to calculate the factorial of a given number
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: Factorial of 0 is 1
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
