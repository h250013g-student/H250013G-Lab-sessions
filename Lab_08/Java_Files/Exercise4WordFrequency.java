import java.util.*;
public class Exercise4WordFrequency {
    public static void main(String[] args) {
        String paragraph = "java is fun and java is useful";
        Map<String, Integer> counts = new HashMap<>();
        for (String word : paragraph.toLowerCase().split("\\s+"))
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        counts.entrySet().stream()
            .sorted((a, b) -> {
                int byCount = b.getValue().compareTo(a.getValue());
                return byCount != 0 ? byCount : a.getKey().compareTo(b.getKey());
            })
            .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
