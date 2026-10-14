class InheritancePerson {
    String name;
    int age;

    InheritancePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + ", age " + age);
    }
}

class PersonStudent extends InheritancePerson {
    String course;

    PersonStudent(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Course: " + course);
    }
}

public class Exercise1PersonStudent {
    public static void main(String[] args) {
        // The student adds course details to the inherited person output.
        new PersonStudent("Leslie Sarai", 21, "Software Engineering").display();
    }
}
