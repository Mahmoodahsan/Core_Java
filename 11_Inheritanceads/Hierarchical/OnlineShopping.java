class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    int quantity;

    public Order(int quantity) {
        this.quantity = quantity;
    }

    public double calculateTotal(Product product) {
        return product.price * quantity;
    }
}

class ElectronicProduct extends Product {
    int warrantyYears;

    public ElectronicProduct(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
    }

    public void showDetails() {
        System.out.println("Electronic Product: " + name + ", Price: " + price + ", Warranty: " + warrantyYears + " years");
    }
}

class ClothingProduct extends Product {
    String size;

    public ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public void showDetails() {
        System.out.println("Clothing Product: " + name + ", Price: " + price + ", Size: " + size);
    }
}

public class OnlineShopping {
    public static void main(String[] args) {
        ElectronicProduct laptop = new ElectronicProduct("Laptop", 60000, 2);
        ClothingProduct shirt = new ClothingProduct("Shirt", 1500, "L");

        laptop.showDetails();
        shirt.showDetails();

        Order order1 = new Order(1);
        Order order2 = new Order(3);

        System.out.println("Laptop Order Total: " + order1.calculateTotal(laptop));
        System.out.println("Shirt Order Total: " + order2.calculateTotal(shirt));
    }
}
