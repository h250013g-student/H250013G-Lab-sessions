class Animal {
    String type = "Animal";
    void speak() { System.out.println("Animal sound"); }
}
class Dog extends Animal {
    String type = "Dog";
    @Override void speak() { System.out.println("Woof"); }
}
public class Exercise4MethodField {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a.type);
        a.speak();
    }
}
