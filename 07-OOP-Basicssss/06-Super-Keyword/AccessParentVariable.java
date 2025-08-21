class Parent {
    int x = 10;
}
class AccessParentVariable extends Parent {
    int x = 20;
    void show() {
        System.out.println(super.x);
    }
}
public class Main1 {
    public static void main(String[] args) {
        new AccessParentVariable().show();
    }
}
