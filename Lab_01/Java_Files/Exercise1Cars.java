public class Exercise1Cars {
    // EXPLAIN: fields store each car's data.
    static class Car {
        String brand; int year; double mileage;
        Car(String brand, int year, double mileage) { this.brand = brand; this.year = year; this.mileage = mileage; }
        void display() { System.out.println(brand + " " + year + " mileage: " + mileage); }
    }
    public static void main(String[] args) {
        Car[] cars = { new Car("Toyota", 2018, 65000), new Car("Honda", 2020, 42000), new Car("Mazda", 2015, 88000) };
        for (Car car : cars) car.display();
    }
}
