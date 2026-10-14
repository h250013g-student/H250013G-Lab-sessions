import java.util.Arrays;

public class Exercise5BubbleSort {
    static <T extends Comparable<T>> void bubbleSort(T[] values) {
        for (int pass = 0; pass < values.length - 1; pass++) {
            for (int index = 0; index < values.length - 1 - pass; index++) {
                if (values[index].compareTo(values[index + 1]) > 0) {
                    T temporary = values[index];
                    values[index] = values[index + 1];
                    values[index + 1] = temporary;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {4, 1, 3, 2};
        String[] words = {"pear", "apple", "zebra"};
        // The generic method sorts any comparable array in place.
        bubbleSort(numbers);
        bubbleSort(words);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(words));
    }
}
