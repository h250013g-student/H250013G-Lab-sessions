import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1SaveReadLines {
    public static void main(String[] args) throws IOException {
        List<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            for (int lineNumber = 1; lineNumber <= 5; lineNumber++) {
                System.out.print("Line " + lineNumber + ": ");
                lines.add(scanner.nextLine());
            }
        }

        Path file = Path.of("lab10-lines.txt");
        Files.write(file, lines);
        System.out.println("Saved lines:");
        // Read the saved file back to show the persisted content.
        for (String line : Files.readAllLines(file)) {
            System.out.println(line);
        }
    }
}
