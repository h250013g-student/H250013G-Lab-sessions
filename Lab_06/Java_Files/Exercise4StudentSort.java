import java.util.*;
class Student implements Comparable<Student> {
    String name; int marks;
    Student(String name, int marks) { this.name = name; this.marks = marks; }
    public int compareTo(Student other) { return name.compareTo(other.name); }
    public String toString() { return name + "(" + marks + ")"; }
}
public class Exercise4StudentSort {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Tariro", 70), new Student("Leslie Sarai", 90), new Student("Anesu", 80)));
        Collections.sort(students);
        System.out.println("By name: " + students);
        students.sort(Comparator.comparingInt(s -> s.marks));
        System.out.println("By marks: " + students);
    }
}
