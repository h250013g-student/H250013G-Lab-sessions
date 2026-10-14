import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exercise2RemoveEven {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        Predicate<Integer> isEven = number -> number % 2 == 0;
        // removeIf updates the list using the predicate for each element.
        numbers.removeIf(isEven);
        System.out.println(numbers);
    }
}
