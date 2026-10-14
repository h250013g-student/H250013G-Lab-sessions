class Person {
    String name; int age;
    Person(String name, int age) { this.name = name; this.age = age; }
    void display() { System.out.println(name + ", age " + age); }
}
class Student extends Person {
    String course;
    Student(String name, int age, String course) {
        super(name, age); this.course = course;
    }
    @Override void display() {
        super.display();
        System.out.println("Course: " + course);
    }
}
public class Exercise1PersonStudent {
    public static void main(String[] args) {
        Student s = new Student("Leslie Sarai", 21, "Software Engineering");
        s.display();
    }
}
