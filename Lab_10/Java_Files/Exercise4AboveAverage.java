import java.util.*;
public class Exercise4AboveAverage {
    record Student(String name, int marks) {}
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("Tariro", 65),
            new Student("Leslie Sarai", 90),
            new Student("Anesu", 80));
        double average = students.stream().mapToInt(Student::marks).average().orElse(0);
        System.out.println("Average: " + average);
        students.stream().filter(s -> s.marks() > average)
            .map(Student::name).sorted().forEach(System.out::println);
    }
}
