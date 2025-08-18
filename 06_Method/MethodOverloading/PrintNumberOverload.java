public class PrintNumbersOverload {
    public static void print(int a) {
        System.out.println("Integer: " + a);
    }
    public static void print(double b) {
        System.out.println("Double: " + b);
    }
    public static void print(String c) {
        System.out.println("String: " + c);
    }
    public static void main(String[] args) {
        print(10);
        print(5.5);
        print("Java");
    }
}
