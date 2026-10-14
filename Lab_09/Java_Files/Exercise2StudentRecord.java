record Student(String name, int age) {}
public class Exercise2StudentRecord {
    public static void main(String[] args) {
        Student s1 = new Student("Leslie Sarai", 21);
        Student s2 = new Student("Leslie Sarai", 21);
        System.out.println(s1);
        System.out.println("Equal? " + s1.equals(s2));
        System.out.println("Name: " + s1.name());
    }
}
