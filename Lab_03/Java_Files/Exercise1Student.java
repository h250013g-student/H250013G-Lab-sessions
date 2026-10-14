class ValidatedStudent {
    private String name;
    private int marks;

    ValidatedStudent(String name, int marks) {
        this.name = name;
        setMarks(marks);
    }

    void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be 0 to 100");
        }
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }

    String getName() {
        return name;
    }
}

public class Exercise1Student {
    public static void main(String[] args) {
        ValidatedStudent student = new ValidatedStudent("Leslie Sarai", 86);
        System.out.println(student.getName() + ": " + student.getMarks());

        try {
            student.setMarks(120);
        } catch (IllegalArgumentException e) {
            // Invalid marks leave the previous value unchanged.
            System.out.println(e.getMessage());
        }
    }
}
