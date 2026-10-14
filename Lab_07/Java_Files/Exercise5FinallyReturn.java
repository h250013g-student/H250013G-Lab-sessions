public class Exercise5FinallyReturn {
    static int example() { try { System.out.println("Inside try"); return 5; } finally { System.out.println("Inside finally"); } }
    public static void main(String[] args) { System.out.println("Returned: "+example()); }
}
