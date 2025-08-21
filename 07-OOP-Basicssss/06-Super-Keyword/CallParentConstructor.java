class A {
    A() {
        System.out.println("Parent Constructor");
    }
}
class B extends A {
    B() {
        super();
        System.out.println("Child Constructor");
    }
}
public class CallParentConstructor {
    public static void main(String[] args) {
        new B();
    }
}
