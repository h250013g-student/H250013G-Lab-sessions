public class Exercise5DefaultConflict {
    interface First { default void hello(){System.out.println("Hello from First");} }
    interface Second { default void hello(){System.out.println("Hello from Second");} }
    static class Greeter implements First, Second { public void hello(){ First.super.hello(); Second.super.hello(); } }
    public static void main(String[] args) { new Greeter().hello(); }
}
