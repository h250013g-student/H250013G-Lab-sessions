public class Exercise2StudentRecord {
    record Student(String name, int age) { }

    public static void main(String[] args) {
        Student first = new Student("Leslie Sarai", 21);
        Student second = new Student("Leslie Sarai", 21);
        // Records provide value-based equality from their components.
        System.out.println(first);
        System.out.println("Equal: " + first.equals(second));
        System.out.println("Name: " + first.name());
    }
}
