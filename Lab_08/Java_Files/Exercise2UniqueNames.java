import java.util.*;
public class Exercise2UniqueNames {
    public static void main(String[] args) { List<String> names=List.of("Tariro","Leslie Sarai","Tariro","Rudo"); Set<String> unique=new LinkedHashSet<>(names); System.out.println(unique); }
}
