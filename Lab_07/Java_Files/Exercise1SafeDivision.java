import java.util.*;

public class Exercise1SafeDivision {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user for two integers and perform division
            System.out.print("Enter  the dividend: ");
            int dividend = scanner.nextInt();
            System.out.print("Enter  the divisor: ");
            int divisor = scanner.nextInt();
            // Perform the division and print the result
            System.out.println("Result: " + (dividend / divisor));
            // Catch exceptions for invalid input and division by zero
        } catch (InputMismatchException e) {
            System.out.println("Please enter integers only");
        } catch (ArithmeticException e) {
            // Integer division by zero is reported separately from invalid input.
            System.out.println("Cannot divide by zero");
        }
    }
}
