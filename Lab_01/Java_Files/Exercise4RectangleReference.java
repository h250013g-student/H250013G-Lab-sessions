public class Exercise4RectangleReference {
    static class Rectangle { double width; Rectangle(double width) { this.width = width; } }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5);
        Rectangle r2 = r1; // EXPLAIN: both variables refer to the same object.
        r2.width = 12;
        System.out.println("r1.width = " + r1.width);
    }
}
