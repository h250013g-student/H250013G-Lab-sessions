class Employee {
    private static int nextId = 1;
    int employeeId;
    String name;
    String department;

    Employee() { this("Unknown", "General"); }
    Employee(String name) { this(name, "General"); }
    Employee(String name, String department) {
        this.employeeId = nextId++;
        this.name = name;
        this.department = department;
    }
    Employee(Employee other) { this(other.name, other.department); }

    void display() {
        System.out.println(employeeId + ": " + name + " - " + department);
    }
}
public class Exercise3Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Leslie Sarai", "IT");
        Employee e2 = new Employee("Tariro");
        Employee e3 = new Employee(e1);
        e1.display(); e2.display(); e3.display();
    }
}
