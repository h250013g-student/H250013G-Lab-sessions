class TeacherPerson {
    String name;

    TeacherPerson(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class TeacherStudent extends TeacherPerson {
    TeacherStudent(String name) {
        super(name);
    }
}

class Teacher extends TeacherPerson {
    String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}

public class Exercise2Teacher {
    public static void main(String[] args) {
        // Both subclasses share the name behavior from TeacherPerson.
        new TeacherStudent("Leslie Sarai").display();
        new Teacher("Mr Moyo", "Java").display();
    }
}
