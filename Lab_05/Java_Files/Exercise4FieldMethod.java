public class Exercise4FieldMethod {
    static class Animal { String type="Animal"; void sound(){System.out.println("Some sound");} }
    static class Dog extends Animal { String type="Dog"; @Override void sound(){System.out.println("Woof");} }
    public static void main(String[] args) { Animal a=new Dog(); System.out.println(a.type); a.sound(); }
}
