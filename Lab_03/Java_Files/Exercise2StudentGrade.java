class Student {
    private String name;
    private int marks;
    Student(String name, int marks) { this.name = name; this.marks = marks; }
    String getGrade() {
        if (marks >= 80) return "A";
        if (marks >= 70) return "B";
        if (marks >= 50) return "C";
        return "F";
    }
}
public class Exercise2StudentGrade {
    public static void main(String[] args) {
        Student s = new Student("Leslie Sarai", 85);
        System.out.println(s.getGrade());
    }
}
