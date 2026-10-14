

public class Exercise2AntiqueCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.year = 1998;
        System.out.println(car.brand + " is antique? " + car.isAntique());
    }
}
