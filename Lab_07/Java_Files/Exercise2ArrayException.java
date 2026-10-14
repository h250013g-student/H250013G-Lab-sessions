public class Exercise2ArrayException {
    static void printItem(int[] values, int index) {
        try {
            System.out.println(values[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }
    public static void main(String[] args) {
        int[] values = {10, 20, 30};
        printItem(values, 1);
        printItem(values, 5);
    }
}
