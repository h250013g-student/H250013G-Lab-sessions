

public class Exercise4RectangleReference {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 3);
        Rectangle r2 = r1; // Both variables refer to the same object
        r2.width = 10;
        System.out.println("r1 width: " + r1.width);
    }
}
