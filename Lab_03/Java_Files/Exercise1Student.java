public class Exercise1Student {
    static class Student {
        private String name; private int marks;
        Student(String name, int marks) { this.name = name; setMarks(marks); }
        void setMarks(int marks) { if (marks < 0 || marks > 100) throw new IllegalArgumentException("Marks must be 0 to 100"); this.marks = marks; }
        int getMarks() { return marks; }
        String getName() { return name; }
    }
    public static void main(String[] args) {
        Student s = new Student("Leslie Sarai", 86); System.out.println(s.getName() + ": " + s.getMarks());
        try { s.setMarks(120); } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
    }
}
