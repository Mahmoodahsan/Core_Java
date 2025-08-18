class Shape {
    public void draw() {
        System.out.println("Drawing a shape...");
    }
}

class TwoDShape extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a 2D shape...");
    }
}

class Circle extends TwoDShape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a Circle with radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.draw();
    }
}
