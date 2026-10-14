public class Exercise5Temperature {
    static class Temperature {
        private final double celsius;
        private Temperature(double celsius) { this.celsius = celsius; }
        static Temperature fromCelsius(double c) { return new Temperature(c); }
        static Temperature fromFahrenheit(double f) { return new Temperature((f - 32) * 5 / 9); }
        double getCelsius() { return celsius; }
    }
    public static void main(String[] args) {
        System.out.printf("Celsius: %.1f%n", Temperature.fromFahrenheit(98.6).getCelsius());
        System.out.printf("Celsius: %.1f%n", Temperature.fromCelsius(25).getCelsius());
    }
}
