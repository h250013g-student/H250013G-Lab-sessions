import java.nio.file.*;
import java.io.*;
import java.util.*;

public class Exercise3TextStats {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("sample.txt");
        if (!Files.exists(file)) {
            Files.writeString(file, "Java is simple.\nOOP uses classes.");
        }

        List<String> lines = Files.readAllLines(file);
        String text = Files.readString(file);
        // Split on whitespace so spaces and line breaks both separate words.
        long words = Arrays.stream(text.trim().split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();
        System.out.println("Lines: " + lines.size());
        System.out.println("Words: " + words);
        System.out.println("Characters: " + text.length());
    }
}
