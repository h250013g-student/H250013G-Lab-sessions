import java.util.*;
import java.util.function.Predicate;
public class Exercise2RemoveEven {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Predicate<Integer> even = n -> n % 2 == 0;
        numbers.removeIf(even);
        System.out.println(numbers);
    }
}
