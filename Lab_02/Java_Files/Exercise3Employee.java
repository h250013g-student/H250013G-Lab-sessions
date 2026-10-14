class ConstructorEmployee {
    private static int nextId = 1;
    int employeeId;
    String name;
    String role;

    ConstructorEmployee() {
        this("Leslie Sarai", "Student Developer");
    }

    ConstructorEmployee(String name) {
        this(name, "Employee");
    }

    ConstructorEmployee(String name, String role) {
        this.employeeId = nextId++;
        this.name = name;
        this.role = role;
    }

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
