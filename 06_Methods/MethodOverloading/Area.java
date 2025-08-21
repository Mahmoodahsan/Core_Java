public class Area {
    public static double area(double radius) {
        return 3.14 * radius * radius;
    }
    public static int area(int length, int breadth) {
        return length * breadth;
    }
    public static void main(String[] args) {
        System.out.println("Circle: " + area(5.0));
        System.out.println("Rectangle: " + area(4, 6));
    }
}
