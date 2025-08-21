class Parent {
    void display() {
        System.out.println("Parent Method");
    }
}
class CallParentMethod extends Parent {
    void display() {
        super.display();
        System.out.println("Child Method");
    }
}
public class Main2 {
    public static void main(String[] args) {
        new CallParentMethod().display();
    }
}
