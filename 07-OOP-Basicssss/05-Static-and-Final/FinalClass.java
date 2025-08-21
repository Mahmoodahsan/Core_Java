final class A {
    void display() {
        System.out.println("Final Class");
    }
}
// class B extends A {} // Not allowed
public class FinalClass {
    public static void main(String[] args) {
        new A().display();
    }
}
