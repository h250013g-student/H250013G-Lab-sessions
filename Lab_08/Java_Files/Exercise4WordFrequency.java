import java.util.*;

public class Exercise4WordFrequency {
    public static void main(String[] args) {
        String text = "java oop java classes oop java";
        Map<String, Integer> frequencies = new HashMap<>();

        for (String word : text.split(" ")) {
            frequencies.merge(word, 1, Integer::sum);
        }

        // Ties are ordered alphabetically for predictable output.
        frequencies.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> System.out.println(
                        entry.getKey() + ": " + entry.getValue()));
    }
}
