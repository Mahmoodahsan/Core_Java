class Rectangle {
    int length, width;
    Rectangle() {
        length = width = 0;
    }
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }
}
public class Main3 {
    public static void main(String[] args) {
        Rectangle b1 = new Rectangle();
        Rectangle b2 = new Rectangle(5, 10);
        System.out.println(b1.length + "," + b1.width);
        System.out.println(b2.length + "," + b2.width);
    }
}
