public class Exercise5FinallyReturn {
    static int example() {
        try {
            System.out.println("Inside try");
            return 5;
        } finally {
            System.out.println("Inside finally");
        }
    }

    public static void main(String[] args) {
        // The finally block runs before the pending return completes.
        System.out.println("Returned: " + example());
    }
}
