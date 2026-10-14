class Rectangle {
    double width, height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double area() { return width * height; }
    double perimeter() { return 2 * (width + height); }
}

public class Exercise3LargestRectangle {
    public static void main(String[] args) {
        Rectangle[] rectangles = {
            new Rectangle(2, 3), new Rectangle(4, 5),
            new Rectangle(3, 7), new Rectangle(6, 2),
            new Rectangle(5, 5)
        };
        Rectangle largest = rectangles[0];
        for (Rectangle r : rectangles) {
            if (r.area() > largest.area()) largest = r;
        }
        System.out.println("Largest area: " + largest.area());
        System.out.println("Perimeter: " + largest.perimeter());
    }
}
