interface Engine {
    void startEngine();
}

interface ElectricEngine extends Engine {
    void chargeBattery();
}

interface Features {
    void showFeatures();
}

class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }
}

class ElectricCar extends Vehicle implements ElectricEngine, Features {
    int batteryLevel;

    public ElectricCar(String brand, int batteryLevel) {
        super(brand);
        this.batteryLevel = batteryLevel;
    }

    public void startEngine() {
        System.out.println("Starting electric engine...");
    }

    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("Battery fully charged.");
    }

    public void showFeatures() {
        System.out.println("Brand: " + brand + ", Battery: " + batteryLevel + "%");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar("Tesla", 50);
        car.showFeatures();
        car.startEngine();
        car.chargeBattery();
        car.showFeatures();
    }
}
