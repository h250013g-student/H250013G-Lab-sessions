class Animal { void sound() { System.out.println("Animal sound"); } }
class Cat extends Animal { @Override void sound() { System.out.println("Meow"); } }
class Cow extends Animal { @Override void sound() { System.out.println("Moo"); } }
class Duck extends Animal { @Override void sound() { System.out.println("Quack"); } }
public class Exercise2AnimalSounds {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Cow(), new Duck()};
        for (Animal a : animals) a.sound();
    }
}
