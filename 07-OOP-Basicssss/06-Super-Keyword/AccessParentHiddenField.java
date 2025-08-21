class A {
    String name = "Parent";
}
class B extends A {
    String name = "Child";
    void printName() {
        System.out.println(super.name);
    }
}
public class AccessParentHiddenField {
    public static void main(String[] args) {
        new B().printName();
    }
}
