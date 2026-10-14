class KelvinTemperature {
    private final double kelvin;

    KelvinTemperature(double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException("Below absolute zero");
        }
        this.kelvin = kelvin;
    }

    double getCelsius() {
        return kelvin - 273.15;
    }

    double getFahrenheit() {
        return getCelsius() * 9 / 5 + 32;
    }
}

public class Exercise5KelvinTemperature {
    public static void main(String[] args) {
        KelvinTemperature temperature = new KelvinTemperature(300);
        // Both conversions use the stored Kelvin value.
        System.out.printf("Celsius %.2f, Fahrenheit %.2f%n",
                temperature.getCelsius(), temperature.getFahrenheit());
    }
}
