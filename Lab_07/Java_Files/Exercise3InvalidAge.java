class InvalidAgeException extends Exception {
    InvalidAgeException(String message) { super(message); }
}
public class Exercise3InvalidAge {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) throw new InvalidAgeException("Age must be from 0 to 120");
        System.out.println("Age accepted");
    }
    public static void main(String[] args) {
        try {
            validateAge(21);
            validateAge(150);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
