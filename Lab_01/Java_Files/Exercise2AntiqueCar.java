import java.time.Year;

class AntiqueCar {
    String brand;
    int year;

    AntiqueCar(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    boolean isAntique() {
        // The age check uses the current calendar year.
        return Year.now().getValue() - year > 25;
    }
}

public class Exercise2AntiqueCar {
    public static void main(String[] args) {
        AntiqueCar car = new AntiqueCar("Toyota", 1998);
        System.out.println(car.brand + " antique? " + car.isAntique());
    }
}
