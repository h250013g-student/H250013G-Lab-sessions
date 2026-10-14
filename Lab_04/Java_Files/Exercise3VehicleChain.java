class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor");
    }
}

class ChainCar extends Vehicle {
    ChainCar() {
        System.out.println("Car constructor");
    }
}

class ElectricCar extends ChainCar {
    ElectricCar() {
        System.out.println("ElectricCar constructor");
    }
}

public class Exercise3VehicleChain {
    public static void main(String[] args) {
        // Constructor calls follow the inheritance chain from top to bottom.
        new ElectricCar();
    }
}
