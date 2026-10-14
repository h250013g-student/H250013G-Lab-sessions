import java.util.*;import java.util.stream.*;
public class Exercise4AboveAverage {
    record Student(String name,int marks){}
    public static void main(String[] args){List<Student> students=List.of(new Student("Leslie Sarai",86),new Student("Tariro",70),new Student("Rudo",90));double avg=students.stream().mapToInt(Student::marks).average().orElse(0);System.out.println("Average: "+avg);students.stream().filter(s->s.marks()>avg).map(Student::name).sorted().forEach(System.out::println);}
}
