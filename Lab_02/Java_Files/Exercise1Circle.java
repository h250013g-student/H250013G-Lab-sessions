class DefaultCircle {
    double radius;

    DefaultCircle(double radius) {
        this.radius = radius;
    }

    DefaultCircle() {
        this(1.0);
    }

}

public class Exercise1Circle {
    public static void main(String[] args) {
        // The default constructor is called here.
        System.out.println(new DefaultCircle().radius);
        // The constructor with a radius argument is called here.
        System.out.println(new DefaultCircle(2.0).radius);
    }
}
