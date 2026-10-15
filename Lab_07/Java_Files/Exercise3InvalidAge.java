class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Exercise3InvalidAge {
    static void validateAge(int age) throws InvalidAgeException {
        // Check if the age is within the valid range
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(150);
        } catch (InvalidAgeException e) {
            // The custom exception carries the validation message.
            System.out.println(e.getMessage());
        }
    }
}
