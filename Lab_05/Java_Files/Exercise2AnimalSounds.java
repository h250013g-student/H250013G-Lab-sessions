class SoundAnimal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends SoundAnimal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

class Cow extends SoundAnimal {
    @Override
    void sound() {
        System.out.println("Moo");
    }
}

class Duck extends SoundAnimal {
    @Override
    void sound() {
        System.out.println("Quack");
    }
}

public class Exercise2AnimalSounds {
    public static void main(String[] args) {
        SoundAnimal[] animals = {new Cat(), new Cow(), new Duck()};
        // The overridden sound method depends on each object's type.
        for (SoundAnimal animal : animals) {
            animal.sound();
        }
    }
}
