public class Exercise4InitOrder {
    static { System.out.println("Static block 1"); }
    static { System.out.println("Static block 2"); }
    { System.out.println("Instance block 1"); }
    { System.out.println("Instance block 2"); }

    Exercise4InitOrder() { System.out.println("Constructor"); }

    public static void main(String[] args) {
        System.out.println("First object");
        new Exercise4InitOrder();
        System.out.println("Second object");
        new Exercise4InitOrder();
    }
}
