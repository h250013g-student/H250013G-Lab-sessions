class Temperature {
    private double celsius;
    private Temperature(double celsius) { this.celsius = celsius; }

    static Temperature fromCelsius(double value) {
        return new Temperature(value);
    }
    static Temperature fromFahrenheit(double value) {
        return new Temperature((value - 32) * 5 / 9);
    }
    double getCelsius() { return celsius; }
}
public class Exercise5Temperature {
    public static void main(String[] args) {
        Temperature a = Temperature.fromCelsius(25);
        Temperature b = Temperature.fromFahrenheit(77);
        System.out.println(a.getCelsius());
        System.out.println(b.getCelsius());
    }
}
