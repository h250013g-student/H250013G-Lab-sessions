import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise5LearnerReports {
    record Learner(String name, int marks) {
        String band() {
            if (marks >= 80) return "A";
            if (marks >= 60) return "B";
            return "C";
        }
    }

    public static void main(String[] args) throws IOException {
        Path input = Path.of("learners.csv");
        if (!Files.exists(input)) {
            Files.write(input, List.of(
                    "Leslie Sarai,86",
                    "Tariro,72",
                    "Rudo,55"));
        }

        List<Learner> learners = Files.readAllLines(input).stream()
                .map(line -> line.split(","))
                .map(values -> new Learner(
                        values[0].trim(),
                        Integer.parseInt(values[1].trim())))
                .toList();
        Map<String, List<Learner>> groups = learners.stream()
                .collect(Collectors.groupingBy(Learner::band));

        // Write one report for each grade, including empty groups.
        for (String band : List.of("A", "B", "C")) {
            List<String> report = groups.getOrDefault(band, List.of()).stream()
                    .map(learner -> learner.name() + "," + learner.marks())
                    .toList();
            Path reportFile = Path.of("grade-" + band + "-report.txt");
            Files.write(reportFile, report);
            System.out.println("Wrote " + reportFile + ": "
                    + report.size() + " learner(s)");
        }
    }
}
