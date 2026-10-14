class ConstructorEmployee {
    private static int nextId = 1;
    int employeeId;
    String name;
    String role;
    // The default constructor calls the two-argument constructor.
    ConstructorEmployee() {
        this("Leslie Sarai", "Student Developer");
    }
    // The one-argument constructor calls the two-argument constructor.
    ConstructorEmployee(String name) {
        this(name, "Employee");
    }
    // The two-argument constructor assigns the employee its own ID.
    ConstructorEmployee(String name, String role) {
        this.employeeId = nextId++;
        this.name = name;
        this.role = role;
    }
    // The copy constructor assigns the new employee its own ID.
    ConstructorEmployee(ConstructorEmployee other) {
        this(other.name, other.role);
    }

    void display() {
        System.out.println(employeeId + ": " + name + " - " + role);
    }
}

public class Exercise3Employee {
    public static void main(String[] args) {
        ConstructorEmployee a = new ConstructorEmployee();
        ConstructorEmployee b = new ConstructorEmployee("Tariro");
        ConstructorEmployee c = new ConstructorEmployee("Rudo", "Designer");
        ConstructorEmployee d = new ConstructorEmployee(c);

        // The copy constructor assigns the new employee its own ID.
        a.display();
        b.display();
        c.display();
        d.display();
    }
}
