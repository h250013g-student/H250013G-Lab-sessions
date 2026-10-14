import java.util.*;
public class Exercise2UniqueNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tariro", "Leslie Sarai", "Tariro", "Anesu");
        Set<String> unique = new LinkedHashSet<>(names);
        System.out.println(unique);
    }
}
