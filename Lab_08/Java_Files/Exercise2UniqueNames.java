import java.util.*;

public class Exercise2UniqueNames {
    public static void main(String[] args) {
        List<String> names = List.of("Tariro", "Leslie Sarai", "Tariro", "Rumbi");
        // LinkedHashSet removes duplicates without changing first-seen order.
        Set<String> uniqueNames = new LinkedHashSet<>(names);
        System.out.println(uniqueNames);
    }
}
