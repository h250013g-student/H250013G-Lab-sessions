class Car {
    String brand;
    int year;
    double mileage;

    void display() {
        System.out.println(brand + " " + year + " " + mileage + " km");
    }

    boolean isAntique() {
        return 2026 - year > 25;
    }
}


public class Exercise1Cars {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota"; c1.year = 2018; c1.mileage = 65000;
        Car c2 = new Car();
        c2.brand = "Honda"; c2.year = 2020; c2.mileage = 42000;
        Car c3 = new Car();
        c3.brand = "Mazda"; c3.year = 2015; c3.mileage = 90000;

        c1.display();
        c2.display();
        c3.display();
    }
}
