import java.nio.file.*;
import java.io.IOException;
import java.util.*;
public class Exercise1FileLines {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            System.out.print("Line " + i + ": ");
            lines.add(input.nextLine());
        }
        Path file = Path.of("lab10-lines.txt");
        Files.write(file, lines);
        System.out.println("File contents:");
        for (String line : Files.readAllLines(file)) System.out.println(line);
        input.close();
    }
}
