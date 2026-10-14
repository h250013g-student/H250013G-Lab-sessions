abstract class Shape {
    abstract double area();

    abstract double perimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}

public class Exercise1Shapes {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(2), new Rectangle(3, 4), new Square(3)};
        // Each shape provides its own implementation of these calculations.
        for (Shape shape : shapes) {
            System.out.printf("Area %.2f, perimeter %.2f%n",
                    shape.area(), shape.perimeter());
        }
    }
}
