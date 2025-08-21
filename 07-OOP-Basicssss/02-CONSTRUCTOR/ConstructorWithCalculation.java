class ConstructorWithCalculation {
    int area;
    ConstructorWithCalculation(int l, int w) {
        area = l * w;
    }
}
public class Main5 {
    public static void main(String[] args) {
        ConstructorWithCalculation r = new ConstructorWithCalculation(4, 5);
        System.out.println("Area: " + r.area);
    }
}

