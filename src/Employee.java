public class Employee {
    static int count = 0;
    private final int employeeid;

    {
        count++;
        employeeid =count;
    }

    // creating a static counter that tracks how many employees exist with a static getter
    public static int getCount(){
        return count;
    }

}
