public class Exercise2StudentRecord {
    record Student(String name,int age) { }
    public static void main(String[] args) { Student a=new Student("Leslie Sarai",21); Student b=new Student("Leslie Sarai",21); System.out.println(a); System.out.println("Equal: "+a.equals(b)); System.out.println("Name: "+a.name()); }
}
