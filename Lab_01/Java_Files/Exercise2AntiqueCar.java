import java.time.Year;
public class Exercise2AntiqueCar {
    static class Car {
        String brand; int year;
        Car(String brand, int year) { this.brand = brand; this.year = year; }
        // EXPLAIN: compare the current year with the car's year.
        boolean isAntique() { return Year.now().getValue() - year > 25; }
    }
    public static void main(String[] args) {
        Car car = new Car("Toyota", 1998);
        System.out.println(car.brand + " antique? " + car.isAntique());
    }
}
