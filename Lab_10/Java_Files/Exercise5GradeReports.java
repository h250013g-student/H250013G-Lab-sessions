import java.nio.file.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
public class Exercise5GradeReports {
    record Learner(String name, String grade) {}
    public static void main(String[] args) throws IOException {
        Path csv = Path.of("learners.csv");
        Files.write(csv, List.of("Leslie Sarai,A", "Tariro,B", "Anesu,A", "Farai,C"));
        List<Learner> learners = Files.readAllLines(csv).stream().map(line -> {
            String[] parts = line.split(",");
            return new Learner(parts[0].trim(), parts[1].trim());
        }).toList();
        Map<String, List<Learner>> groups = learners.stream()
            .collect(Collectors.groupingBy(Learner::grade));
        for (String grade : List.of("A", "B", "C")) {
            List<String> report = groups.getOrDefault(grade, List.of()).stream()
                .map(Learner::name).toList();
            Files.write(Path.of("grade-" + grade + "-report.txt"), report);
            System.out.println("Wrote grade-" + grade + "-report.txt");
        }
    }
}
