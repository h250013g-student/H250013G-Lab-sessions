import java.util.Scanner;
public class Exercise1SafeDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter two integers: ");
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter integers only");
        }
        input.close();
    }
}
