interface Flyable { void fly(); }
class Bird implements Flyable {
    public void fly() { System.out.println("Bird flies with wings"); }
}
class Aeroplane implements Flyable {
    public void fly() { System.out.println("Aeroplane flies with engines"); }
}
public class Exercise2Flyable {
    public static void main(String[] args) {
        Flyable[] things = {new Bird(), new Aeroplane()};
        for (Flyable f : things) f.fly();
    }
}
