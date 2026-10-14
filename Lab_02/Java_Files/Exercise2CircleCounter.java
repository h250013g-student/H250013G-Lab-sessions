class Circle {
    private static int count = 0;
    double radius;
    Circle(double radius) { this.radius = radius; count++; }
    static int getCount() { return count; }
}
public class Exercise2CircleCounter {
    public static void main(String[] args) {
        new Circle(2);
        new Circle(4);
        new Circle(1);
        System.out.println("Circles created: " + Circle.getCount());
    }
}
