class Vehicle {
    public void fuelType() {
        System.out.println("Vehicle uses fuel");
    }
}

class Car extends Vehicle {
    @Override
    public void fuelType() {
        System.out.println("Car uses petrol or diesel");
    }
}

class ElectricCar extends Car {
    @Override
    public void fuelType() {
        System.out.println("Electric Car uses battery");
    }

    public void charge() {
        System.out.println("Charging the electric car...");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.fuelType();
        ec.charge();
    }
}
