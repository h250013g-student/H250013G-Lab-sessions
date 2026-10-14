import java.util.*;
public class Exercise1SafeDivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try { System.out.print("Enter two integers: "); int a=sc.nextInt(), b=sc.nextInt(); System.out.println("Result: "+(a/b)); }
        catch(InputMismatchException e){System.out.println("Please enter integers only");}
        catch(ArithmeticException e){System.out.println("Cannot divide by zero");}
    }
}
