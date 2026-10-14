public class Exercise3InternPayroll {
    static class Employee { String name; double salary; Employee(String n,double s){name=n;salary=s;} double pay(){return salary;} }
    static class Intern extends Employee { Intern(String n,double stipend){super(n,stipend);} @Override double pay(){return salary;} }
    static class Manager extends Employee { double bonus; Manager(String n,double s,double b){super(n,s);bonus=b;} @Override double pay(){return salary+bonus;} }
    public static void main(String[] args) { Employee[] staff={new Employee("Leslie Sarai",500),new Intern("Tariro",250),new Manager("Rudo",1000,200)}; double total=0; for(Employee e:staff) total+=e.pay(); System.out.println("Total payroll: "+total); }
}
