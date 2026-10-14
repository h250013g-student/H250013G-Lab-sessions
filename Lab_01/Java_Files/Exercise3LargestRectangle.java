public class Exercise3LargestRectangle {
    static class Rectangle {
        double width, height;
        Rectangle(double width, double height) { this.width = width; this.height = height; }
        double area() { return width * height; }
        double perimeter() { return 2 * (width + height); }
    }
    public static void main(String[] args) {
        Rectangle[] rs = { new Rectangle(2,3), new Rectangle(4,5), new Rectangle(3,6), new Rectangle(7,2), new Rectangle(5,5) };
        Rectangle largest = rs[0];
        for (Rectangle r : rs) if (r.area() > largest.area()) largest = r;
        System.out.println("Largest area: " + largest.area());
        System.out.println("Perimeter: " + largest.perimeter());
    }
}
