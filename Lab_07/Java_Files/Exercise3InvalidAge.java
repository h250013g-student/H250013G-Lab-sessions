public class Exercise3InvalidAge {
    static class InvalidAgeException extends Exception { InvalidAgeException(String message){super(message);} }
    static void validateAge(int age) throws InvalidAgeException { if(age<0 || age>120) throw new InvalidAgeException("Age must be between 0 and 120"); }
    public static void main(String[] args) { try { validateAge(150); } catch(InvalidAgeException e) { System.out.println(e.getMessage()); } }
}
