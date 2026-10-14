abstract class Shape {
    abstract double area();
    abstract double perimeter();
}
class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
    double area() { return Math.PI * radius * radius; }
    double perimeter() { return 2 * Math.PI * radius; }
}
class Rectangle extends Shape {
    double width, height;
    Rectangle(double width, double height) { this.width = width; this.height = height; }
    double area() { return width * height; }
    double perimeter() { return 2 * (width + height); }
}
class Square extends Shape {
    double side;
    Square(double side) { this.side = side; }
    double area() { return side * side; }
    double perimeter() { return 4 * side; }
}
public class Exercise1Shapes {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(2), new Rectangle(3, 4), new Square(3)};
        for (Shape s : shapes) System.out.printf("Area: %.2f, Perimeter: %.2f%n", s.area(), s.perimeter());
    }
}
