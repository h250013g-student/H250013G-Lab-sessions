import java.util.*;
public class Exercise1IntegerList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 8, 2, 9, 1, 7, 3, 6, 5, 10));
        int sum = 0;
        for (int n : numbers) sum += n;
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + Collections.max(numbers));
        Collections.reverse(numbers);
        System.out.println("Reverse: " + numbers);
    }
}
