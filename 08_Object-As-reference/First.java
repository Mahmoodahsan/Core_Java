public class First {
    public static void main(String[] args) {
        Product p1 = new Product();
        System.out.println(p1);
        Product p2 = new Product(p1);
        System.out.println(p2);
    }
}

class Product {
    int a;
    int b;
    public Product() {
        System.out.println("hello p");
    }
    public Product(Product p1) {
        System.out.println("hello");
    }
}
