import java.util.*;
public class Exercise4ComparableStudent {
    static class Student implements Comparable<Student> { String name; int marks; Student(String n,int m){name=n;marks=m;} public int compareTo(Student s){return name.compareTo(s.name);} public String toString(){return name+"("+marks+")";} }
    public static void main(String[] args) { List<Student> students=new ArrayList<>(List.of(new Student("Tariro",70),new Student("Leslie Sarai",86),new Student("Rudo",91))); Collections.sort(students); System.out.println("By name: "+students); students.sort(Comparator.comparingInt(s->s.marks)); System.out.println("By marks: "+students); }
}
