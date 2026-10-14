import java.util.*;

public class Exercise1IntegerList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(
                List.of(4, 8, 2, 9, 1, 6, 3, 10, 5, 7));
        int sum = 0;
        int maximum = numbers.get(0);

        for (int number : numbers) {
            sum += number;
            if (number > maximum) {
                maximum = number;
            }
        }

        System.out.println("List: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + maximum);
        // Reverse the same list after reporting its original order.
        Collections.reverse(numbers);
        System.out.println("Reverse: " + numbers);
    }
}
