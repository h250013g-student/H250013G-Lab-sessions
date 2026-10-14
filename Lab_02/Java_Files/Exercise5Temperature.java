class Temperature {
    private final double celsius;

    private Temperature(double celsius) {
        this.celsius = celsius;
    }

    static Temperature fromCelsius(double celsius) {
        return new Temperature(celsius);
    }

    static Temperature fromFahrenheit(double fahrenheit) {
        return new Temperature((fahrenheit - 32) * 5 / 9);
    }

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
