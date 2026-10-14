class Temperature {
    private final double celsius;

    private Temperature(double celsius) {
        this.celsius = celsius;
    }
    // Factory methods can be used to create instances from different units.
    static Temperature fromCelsius(double celsius) {
        return new Temperature(celsius);
    }
    // Factory methods can be used to create instances from different units.
    static Temperature fromFahrenheit(double fahrenheit) {
        return new Temperature((fahrenheit - 32) * 5 / 9);
    }
// The internal value is always stored in Celsius.
    double getCelsius() {
        return celsius;
    }
}

public class Exercise5Temperature {
    public static void main(String[] args) {
        // Factory methods keep the internal value in Celsius.
        System.out.printf("Celsius: %.1f%n", Temperature.fromFahrenheit(98.6).getCelsius());
        System.out.printf("Celsius: %.1f%n", Temperature.fromCelsius(25).getCelsius());
    }
}
