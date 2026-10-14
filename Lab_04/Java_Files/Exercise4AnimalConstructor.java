public class Exercise4AnimalConstructor {
    static class Animal { String name; Animal(String name) { this.name = name; } }
    static class Dog extends Animal {
        Dog(String name) { super(name); } // EXPLAIN: required because Animal has no no-argument constructor.
    }
    public static void main(String[] args) { System.out.println(new Dog("Buddy").name); }
}
