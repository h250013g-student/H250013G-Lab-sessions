class Car {
    String brand;
    int year;
    double mileage;

    void display() {
        System.out.println(brand + " " + year + " mileage: " + mileage);
    }
}

public class Exercise1Cars {
    public static void main(String[] args) {
        // The implicit no-argument constructor creates each car.
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.year = 2018;
        car1.mileage = 65000;

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.year = 2020;
        car2.mileage = 42000;

        Car car3 = new Car();
        car3.brand = "Mazda";
        car3.year = 2015;
        car3.mileage = 88000;

        car1.display();
        car2.display();
        car3.display();
    }
}
