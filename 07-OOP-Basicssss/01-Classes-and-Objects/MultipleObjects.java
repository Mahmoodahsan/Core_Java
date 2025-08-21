class Car {
    String brand;
}
public class MultipleObjects{
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.brand = "BMW";
        c2.brand = "Audi";
        System.out.println(c1.brand + " & " + c2.brand);
    }
}
