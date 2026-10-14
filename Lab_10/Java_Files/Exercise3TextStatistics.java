import java.nio.file.*;
import java.io.IOException;
import java.util.*;
public class Exercise3TextStatistics {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("sample.txt");
        Files.writeString(file, "Java is fun\nOOP is useful");
        List<String> lines = Files.readAllLines(file);
        String content = Files.readString(file);
        long words = Arrays.stream(content.trim().split("\\s+")).count();
        System.out.println("Lines: " + lines.size());
        System.out.println("Words: " + words);
        System.out.println("Characters: " + content.length());
    }
}
