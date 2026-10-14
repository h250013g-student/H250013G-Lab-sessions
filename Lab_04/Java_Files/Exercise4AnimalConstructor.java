class ConstructorAnimal {
    String name;

    ConstructorAnimal(String name) {
        this.name = name;
    }
}

class Dog extends ConstructorAnimal {
    Dog(String name) {
        // Pass the required name to the superclass constructor.
        super(name);
    }
}

public class Exercise4AnimalConstructor {
    public static void main(String[] args) {
        System.out.println(new Dog("Buddy").name);
    }
}
