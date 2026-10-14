class Person {
    String name;
    Person(String name) { this.name = name; }
    void display() { System.out.println("Name: " + name); }
}
class Student extends Person {
    Student(String name) { super(name); }
}
class Teacher extends Person {
    String subject;
    Teacher(String name, String subject) { super(name); this.subject = subject; }
    @Override void display() { super.display(); System.out.println("Subject: " + subject); }
}
public class Exercise2PersonTeacher {
    public static void main(String[] args) {
        new Student("Leslie Sarai").display();
        Teacher t = new Teacher("Mr Moyo", "Java");
        t.display();
    }
}
