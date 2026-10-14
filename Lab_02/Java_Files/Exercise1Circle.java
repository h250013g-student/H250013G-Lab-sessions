public class Exercise1Circle {
    static class Circle {
        double radius;
        Circle(double radius) { this.radius = radius; }
        Circle() { this(1.0); } // EXPLAIN: reuse the other constructor.
        double area() { return Math.PI * radius * radius; }
    }
    public static void main(String[] args) {
        System.out.println(new Circle().radius);
        System.out.printf("%.2f%n", new Circle(3).area());
    }
}
