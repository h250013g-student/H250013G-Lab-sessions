public class Exercise2ArrayAccess {
    static void printElement(int[] values, int index) {
        try {
            System.out.println(values[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }

    public static void main(String[] args) {
        int[] values = {10, 20, 30};
        // The second call demonstrates how an invalid index is handled.
        printElement(values, 1);
        printElement(values, 5);
    }
}
