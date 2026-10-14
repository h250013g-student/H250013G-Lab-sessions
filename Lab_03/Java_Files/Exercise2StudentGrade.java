public class Exercise2StudentGrade {
    static class Student {
        private int marks; Student(int marks) { this.marks = marks; }
        String getGrade() { if (marks >= 80) return "A"; if (marks >= 70) return "B"; if (marks >= 50) return "C"; return "F"; }
    }
    public static void main(String[] args) { System.out.println("Grade: " + new Student(86).getGrade()); }
}
