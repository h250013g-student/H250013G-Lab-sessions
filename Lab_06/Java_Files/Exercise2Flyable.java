public class Exercise2Flyable {
    interface Flyable { void fly(); }
    static class Bird implements Flyable { public void fly(){System.out.println("Bird flies with wings");} }
    static class Aeroplane implements Flyable { public void fly(){System.out.println("Aeroplane flies with engines");} }
    public static void main(String[] args) { Flyable[] things={new Bird(),new Aeroplane()}; for(Flyable f:things) f.fly(); }
}
