class Employee {
    String name; double salary;
    Employee(String name, double salary) { this.name = name; this.salary = salary; }
    double calculatePay() { return salary; }
}
class Intern extends Employee {
    Intern(String name, double stipend) { super(name, stipend); }
    @Override double calculatePay() { return salary * 0.8; }
}
public class Exercise3InternPayroll {
    public static void main(String[] args) {
        Employee[] staff = {new Employee("Tariro", 1000), new Intern("Leslie Sarai", 500)};
        double total = 0;
        for (Employee e : staff) total += e.calculatePay();
        System.out.println("Total payroll: " + total);
    }
}
