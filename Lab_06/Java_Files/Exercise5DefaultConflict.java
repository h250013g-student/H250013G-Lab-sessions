interface First {
    default void hello() { System.out.println("Hello from First"); }
}
interface Second {
    default void hello() { System.out.println("Hello from Second"); }
}
class Greeting implements First, Second {
    public void hello() {
        First.super.hello();
        Second.super.hello();
    }
}
public class Exercise5DefaultConflict {
    public static void main(String[] args) {
        new Greeting().hello();
    }
}
