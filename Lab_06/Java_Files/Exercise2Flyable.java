public class Exercise2Flyable {
    interface Flyable { void fly(); }
    public static void main(String[] args) {
        Flyable[] things = {new Bird(), new Aeroplane()};
        // The same interface supports different flying implementations.
        for (Flyable thing : things) {
            thing.fly();
        }
    }
}

class Bird implements Exercise2Flyable.Flyable {
    @Override
    public void fly() {
        System.out.println("Bird flies with wings");
    }
}

class Aeroplane implements Exercise2Flyable.Flyable {
    @Override
    public void fly() {
        System.out.println("Aeroplane flies with engines");
    }
}
