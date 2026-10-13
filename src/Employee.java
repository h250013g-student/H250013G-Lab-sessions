public class Employee {

    // counter variable
    static int count = 0;

    // intance variables
    private final int employeeid;
    private  String name;
    private String department;
    private Double salary;


    {
        count++;
        employeeid =count;
    }
    // this constructor accepts all arguments
    public Employee(String name,String department,Double salary){
        this.name = name;
        this.department= department;
        this.salary=salary;
    }

    // this constructor accepts name and department with salary default= 0.0
    public Employee(String name,String department){
        this(name, department,0.0);
    }

    // this constructor accepts name only with department default to Unassigned and salary default= 0.0
    public Employee(String name){
        this(name, "Unassigned",0.0);
    }

    // this is a copy constructor
    public Employee(Employee employee){
        this(employee.name,employee.department,employee.salary);
    }


    // creating a static counter that tracks how many employees exist with a static getter
    public static int getCount(){
        return count;
    }


    public static void main(String[] args){
        // for the constructor that accepts all arguments
        Employee emp1 = new Employee("leslie","Finance",45.6);

        // for the constructor that accepts name and department only
        Employee emp2 = new Employee("Rumbidzaishe","Markerting");

        // for the constructor that accepts name  only
        Employee emp3 = new Employee("Makanaka");

        // for the copy constructor
        Employee emp4 = new Employee(emp1);

        // Printing
        System.out.println("Number : "+ Employee.getCount());
        System.out.println("Employee id: "+emp1.employeeid+" Name: "+ emp1.name +" Department: "+ emp1.department+" Salary: " + emp1.salary);
        System.out.println("Employee id: "+emp2.employeeid+" Name: "+ emp2.name +" Department: "+ emp2.department+" Salary: " + emp2.salary);
        System.out.println("Employee id: "+emp3.employeeid+" Name: "+ emp3.name +" Department: "+ emp3.department+" Salary: " + emp3.salary);
        System.out.println("Employee id: "+emp4.employeeid+" Name: "+ emp4.name +" Department: "+ emp4.department+" Salary: " + emp4.salary);
    }

}
