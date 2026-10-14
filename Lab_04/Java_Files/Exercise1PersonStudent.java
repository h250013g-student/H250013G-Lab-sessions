public class Exercise1PersonStudent {
    static class Person { String name; int age; Person(String name, int age) { this.name = name; this.age = age; } void display() { System.out.println(name + ", age " + age); } }
    static class Student extends Person { String course; Student(String n, int a, String c) { super(n, a); course = c; } @Override void display() { super.display(); System.out.println("Course: " + course); } }
    public static void main(String[] args) { new Student("Leslie Sarai", 21, "Software Engineering").display(); }
}
