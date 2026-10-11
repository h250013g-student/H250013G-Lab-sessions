public class Course {
    String title;
    Student topStudent;

    public static  void main(String[] args){
        Student s = new Student();
        s.name = "Rumbi";
        s.gpa = 3.9;

        Course c = new Course();
        c.title = "OOP";
        c.topStudent=s;

        System.out.println(c.title + " top student: " + c.topStudent.name);
    }
}
