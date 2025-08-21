class PassThisAsArgument {
    void display(PassThisAsArgument t) {
        System.out.println("Object Passed");
    }
    void call() {
        display(this);
    }
}
public class Main4 {
    public static void main(String[] args) {
        new PassThisAsArgument().call();
    }
}
