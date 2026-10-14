class Animal {
    String name;
    Animal(String name) { this.name = name; }
}
class Dog extends Animal {
    Dog(String name) {
        super(name); // Required because Animal has no no-argument constructor
    }
}
public class Exercise4ConstructorFix {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println(dog.name);
    }
}
