import java.nio.file.*;
import java.io.*;
import java.util.*;
public class Exercise3TextStats {
    public static void main(String[] args) throws IOException {
        Path p = Path.of("sample.txt");
        if (!Files.exists(p)) Files.writeString(p, "Java is simple.\nOOP uses classes.");
        List<String> lines = Files.readAllLines(p);
        String text = Files.readString(p);
        long words = Arrays.stream(text.trim().split("\\s+")).filter(s -> !s.isEmpty()).count();
        System.out.println("Lines: " + lines.size());
        System.out.println("Words: " + words);
        System.out.println("Characters: " + text.length());
    }
}
