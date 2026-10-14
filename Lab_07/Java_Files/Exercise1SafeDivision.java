import java.util.*;

public class Exercise1SafeDivision {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter two integers: ");
            int dividend = scanner.nextInt();
            int divisor = scanner.nextInt();
            System.out.println("Result: " + (dividend / divisor));
        } catch (InputMismatchException e) {
            System.out.println("Please enter integers only");
        } catch (ArithmeticException e) {
            // Integer division by zero is reported separately from invalid input.
            System.out.println("Cannot divide by zero");
        }
    }
}
