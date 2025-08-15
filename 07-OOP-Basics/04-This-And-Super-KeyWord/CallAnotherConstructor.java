class CallAnotherConstructor {
    CallAnotherConstructor() {
        this("Mahmood");
        System.out.println("Default Constructor");
    }
    CallAnotherConstructor(String name) {
        System.out.println("Name: " + name);
    }
}
public class Main2 {
    public static void main(String[] args) {
        new CallAnotherConstructor();
    }
}
