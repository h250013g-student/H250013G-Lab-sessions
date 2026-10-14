class FieldAnimal {
    String type = "Animal";

    void sound() {
        System.out.println("Some sound");
    }
}

class FieldDog extends FieldAnimal {
    String type = "Dog";

    @Override
    void sound() {
        System.out.println("Woof");
    }
}

public class Exercise4FieldMethod {
    public static void main(String[] args) {
        FieldAnimal animal = new FieldDog();
        // Fields use the reference type, while methods dispatch at runtime.
        System.out.println(animal.type);
        animal.sound();
    }
}
