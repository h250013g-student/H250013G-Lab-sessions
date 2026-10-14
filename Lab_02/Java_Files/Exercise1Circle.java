class Circle {
    double radius;
    Circle(double radius) { this.radius = radius; }
    Circle() { this(1.0); }
    double area() { return Math.PI * radius * radius; }
}
public class Exercise1Circle {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.0);
        Circle c2 = new Circle();
        System.out.println("Circle 1 radius: " + c1.radius);
        System.out.println("Circle 2 radius: " + c2.radius);
    }
}
