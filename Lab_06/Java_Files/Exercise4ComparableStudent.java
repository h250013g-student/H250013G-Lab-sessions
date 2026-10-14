import java.util.*;

class ComparableStudent implements Comparable<ComparableStudent> {
    String name;
    int marks;

    ComparableStudent(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(ComparableStudent other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + "(" + marks + ")";
    }
}

public class Exercise4ComparableStudent {
    public static void main(String[] args) {
        List<ComparableStudent> students = new ArrayList<>(List.of(
                new ComparableStudent("Tariro", 70),
                new ComparableStudent("Leslie Sarai", 86),
                new ComparableStudent("Rudo", 91)));
        Collections.sort(students);
        System.out.println("By name: " + students);

        // This comparator provides an alternate ordering without changing compareTo.
        students.sort(Comparator.comparingInt(student -> student.marks));
        System.out.println("By marks: " + students);
    }
}
