public class Exercise2Teacher {
    static class Person { String name; Person(String name) { this.name = name; } void display() { System.out.println("Name: " + name); } }
    static class Student extends Person { Student(String n) { super(n); } }
    static class Teacher extends Person { String subject; Teacher(String n, String s) { super(n); subject = s; } @Override void display() { super.display(); System.out.println("Subject: " + subject); } }
    public static void main(String[] args) { new Student("Leslie Sarai").display(); new Teacher("Mr Moyo", "Java").display(); }
}
