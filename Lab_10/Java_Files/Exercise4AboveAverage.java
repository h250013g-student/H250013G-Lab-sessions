import java.util.List;

public class Exercise4AboveAverage {
    record Student(String name, int marks) { }

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Leslie Sarai", 86),
                new Student("Tariro", 70),
                new Student("Rudo", 90));
        double average = students.stream()
                .mapToInt(Student::marks)
                .average()
                .orElse(0);
        System.out.println("Average: " + average);

        // Print only names with marks strictly above the average.
        students.stream()
                .filter(student -> student.marks() > average)
                .map(Student::name)
                .sorted()
                .forEach(System.out::println);
    }
}
