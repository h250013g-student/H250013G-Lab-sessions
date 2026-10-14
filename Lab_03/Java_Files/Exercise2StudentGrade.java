class GradeStudent {
    private int marks;

    GradeStudent(int marks) {
        this.marks = marks;
    }

    String getGrade() {
        if (marks >= 80) return "A";
        if (marks >= 70) return "B";
        if (marks >= 50) return "C";
        return "F";
    }
}

public class Exercise2StudentGrade {
    public static void main(String[] args) {
        // Check the highest grade threshold first.
        System.out.println("Grade: " + new GradeStudent(86).getGrade());
    }
}
