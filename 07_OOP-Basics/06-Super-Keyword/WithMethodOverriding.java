class A {
    void show() {
        System.out.println("A class");
    }
}
class B extends A {
    void show() {
        super.show();
        System.out.println("B class");
    }
}
public class WithMethodOverriding {
    public static void main(String[] args) {
        new B().show();
    }
}
