public class Exercise5KelvinTemperature {
    static class Temperature {
        private final double kelvin;
        Temperature(double kelvin) { if (kelvin < 0) throw new IllegalArgumentException("Below absolute zero"); this.kelvin = kelvin; }
        double getCelsius() { return kelvin - 273.15; }
        double getFahrenheit() { return getCelsius() * 9 / 5 + 32; }
    }
    public static void main(String[] args) { Temperature t = new Temperature(300); System.out.printf("Celsius %.2f, Fahrenheit %.2f%n", t.getCelsius(), t.getFahrenheit()); }
}
