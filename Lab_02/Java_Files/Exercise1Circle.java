class DefaultCircle {
    double radius;

    DefaultCircle(double radius) {
        this.radius = radius;
    }

    DefaultCircle() {
        this(1.0);
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class Exercise1Circle {
    public static void main(String[] args) {
        System.out.println(new DefaultCircle().radius);
        // Area is calculated from the circle's radius.
        System.out.printf("%.2f%n", new DefaultCircle(3).area());
    }
}
