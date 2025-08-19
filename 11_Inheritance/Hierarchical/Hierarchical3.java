class Shape {
    public void area() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
}

public class Hierarchical3 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        s1.area();
        s2.area();
    }
}
