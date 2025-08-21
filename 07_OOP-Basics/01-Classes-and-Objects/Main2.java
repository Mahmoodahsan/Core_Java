class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}
public class Main2 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum: " + c.add(5, 10));
    }
}
