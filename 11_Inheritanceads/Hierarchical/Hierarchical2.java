class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    public void showDetails() {
        display();
        System.out.println("Doors: " + doors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    public Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
    }

    public void showDetails() {
        display();
        System.out.println("Has Gear: " + hasGear);
    }
}

public class Hierarchical2 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, 4);
        Bike bike = new Bike("Yamaha", 120, true);

        car.showDetails();
        System.out.println();
        bike.showDetails();
    }
}
