public class Exercise3Employee {
    static class Employee {
        private static int nextId = 1; int employeeId; String name; String role;
        Employee() { this("Leslie Sarai", "Student Developer"); }
        Employee(String name) { this(name, "Employee"); }
        Employee(String name, String role) { this.employeeId = nextId++; this.name = name; this.role = role; }
        Employee(Employee other) { this(other.name, other.role); }
        void display() { System.out.println(employeeId + ": " + name + " - " + role); }
    }
    public static void main(String[] args) {
        Employee a = new Employee(); Employee b = new Employee("Tariro"); Employee c = new Employee("Rudo", "Designer"); Employee d = new Employee(c);
        a.display(); b.display(); c.display(); d.display();
    }
}
