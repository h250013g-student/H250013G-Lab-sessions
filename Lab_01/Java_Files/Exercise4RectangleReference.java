class ReferencedRectangle {
    double width;

    ReferencedRectangle(double width) {
        this.width = width;
    }
}

public class Exercise4RectangleReference {
    public static void main(String[] args) {
        ReferencedRectangle r1 = new ReferencedRectangle(5);
        // Both variables point to this same rectangle.
        ReferencedRectangle r2 = r1;
        r2.width = 12;
        System.out.println("r1.width = " + r1.width);
    }
}
