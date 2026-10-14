class PayrollEmployee {
    String name;
    double salary;

    PayrollEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double pay() {
        return salary;
    }
}

class Intern extends PayrollEmployee {
    Intern(String name, double stipend) {
        super(name, stipend);
    }

    @Override
    double pay() {
        return salary;
    }
}

class Manager extends PayrollEmployee {
    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    double pay() {
        return salary + bonus;
    }
}

public class Exercise3InternPayroll {
    public static void main(String[] args) {
        PayrollEmployee[] staff = {
            new PayrollEmployee("Leslie Sarai", 500),
            new Intern("Tariro", 250),
            new Manager("Rudo", 1000, 200)
        };
        double total = 0;
        // Each employee type supplies its own pay calculation.
        for (PayrollEmployee employee : staff) {
            total += employee.pay();
        }
        System.out.println("Total payroll: " + total);
    }
}
