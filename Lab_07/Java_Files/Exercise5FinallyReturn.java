public class Exercise5FinallyReturn {
    static int test() {
        try {
            System.out.println("Inside try");
            return 10;
        } finally {
            System.out.println("Inside finally");
        }
    }
    public static void main(String[] args) {
        System.out.println("Returned: " + test());
    }
}
