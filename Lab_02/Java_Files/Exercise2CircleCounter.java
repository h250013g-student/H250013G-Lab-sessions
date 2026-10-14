public class Exercise2CircleCounter {
    static class Circle {
        private static int count = 0; double radius;
        Circle(double radius) { this.radius = radius; count++; }
        static int getCount() { return count; }
    }
    public static void main(String[] args) {
        new Circle(1); new Circle(2); new Circle(3);
        System.out.println("Circles created: " + Circle.getCount());
    }
}
