import java.time.Year;

class Car {
    String brand;
    int year;

    boolean isAntique() {
        // The age check uses the current calendar year.
        return Year.now().getValue() - year > 25;
    }
}

public class Exercise2AntiqueCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.year = 1998;
        System.out.println(car.brand + " antique? " + car.isAntique());
    }
}
