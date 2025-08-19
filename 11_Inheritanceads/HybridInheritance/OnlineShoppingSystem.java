interface Discount {
    double applyDiscount(double price);
}

interface Cashback {
    double applyCashback(double price);
}

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class SpecialOffer extends Product implements Discount, Cashback {
    double discountRate;
    double cashback;

    public SpecialOffer(String name, double price, double discountRate, double cashback) {
        super(name, price);
        this.discountRate = discountRate;
        this.cashback = cashback;
    }

    public double applyDiscount(double price) {
        return price - (price * discountRate / 100);
    }

    public double applyCashback(double price) {
        return price - cashback;
    }

    public void showFinalPrice() {
        double discounted = applyDiscount(price);
        double finalPrice = applyCashback(discounted);
        System.out.println(name + " Final Price: " + finalPrice);
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        SpecialOffer offer = new SpecialOffer("Laptop", 60000, 10, 2000);
        offer.showFinalPrice();
    }
}
