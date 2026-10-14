class CountedCircle {
    private static int count = 0;
    double radius;

    CountedCircle(double radius) {
        this.radius = radius;
        count++;
    }

    static int getCount() {
        return count;
    }
}

public class Exercise2CircleCounter {
    public static void main(String[] args) {
        new CountedCircle(1);
        new CountedCircle(2);
        new CountedCircle(3);
        // The shared counter tracks all constructed circles.
        System.out.println("Circles created: " + CountedCircle.getCount());
    }
}
