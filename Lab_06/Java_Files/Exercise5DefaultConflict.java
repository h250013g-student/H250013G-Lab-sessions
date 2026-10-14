public class Exercise5DefaultConflict {
    interface First {
        default void hello() {
            System.out.println("Hello from First");
        }
    }

    interface Second {
        default void hello() {
            System.out.println("Hello from Second");
        }
    }

    public static void main(String[] args) {
        new Greeter().hello();
    }
}

class Greeter implements Exercise5DefaultConflict.First, Exercise5DefaultConflict.Second {
    @Override
    public void hello() {
        // Resolve the conflict by explicitly invoking both defaults.
        Exercise5DefaultConflict.First.super.hello();
        Exercise5DefaultConflict.Second.super.hello();
    }
}
