class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showPrice() {
        System.out.println(name + " Price: " + price);
    }
}

class DiscountedProduct extends Product {
    double discount;

    public DiscountedProduct(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }

    @Override
    public void showPrice() {
        double discountedPrice = price - (price * discount / 100);
        System.out.println(name + " Price after " + discount + "% discount: " + discountedPrice);
    }
}

class SpecialOffer extends DiscountedProduct {
    double cashback;

    public SpecialOffer(String name, double price, double discount, double cashback) {
        super(name, price, discount);
        this.cashback = cashback;
    }

    @Override
    public void showPrice() {
        double discountedPrice = price - (price * discount / 100);
        double finalPrice = discountedPrice - cashback;
        System.out.println(name + " Final Price after discount and cashback: " + finalPrice);
    }
}

public class ProductDiscount {
    public static void main(String[] args) {
        SpecialOffer offer = new SpecialOffer("Laptop", 60000, 10, 2000);
        offer.showPrice();
    }
}
