public class Exercise3VehicleChain {
    static class Vehicle { Vehicle() { System.out.println("Vehicle constructor"); } }
    static class Car extends Vehicle { Car() { System.out.println("Car constructor"); } }
    static class ElectricCar extends Car { ElectricCar() { System.out.println("ElectricCar constructor"); } }
    public static void main(String[] args) { new ElectricCar(); }
}
