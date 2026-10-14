class MeasuredRectangle {
    double width;
    double height;

    MeasuredRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }
}

public class Exercise3LargestRectangle {
    public static void main(String[] args) {
        MeasuredRectangle[] rectangles = {
            new MeasuredRectangle(2, 3),
            new MeasuredRectangle(4, 5),
            new MeasuredRectangle(3, 6),
            new MeasuredRectangle(7, 2),
            new MeasuredRectangle(5, 5)
        };
        MeasuredRectangle largest = rectangles[0];
        // Keep the largest area found so far.
        for (MeasuredRectangle rectangle : rectangles) {
            if (rectangle.area() > largest.area()) {
                largest = rectangle;
            }
        }

        System.out.println("Largest area: " + largest.area());
        System.out.println("Perimeter: " + largest.perimeter());
    }
}
