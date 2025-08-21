class ClassWithTwoMethods{
    void sayHello() {
        System.out.println("Hello!");
    }
    void sayBye() {
        System.out.println("Goodbye!");
    }
}
public class Main4 {
    public static void main(String[] args) {
        ClassWithTwoMethods g = new ClassWithTwoMethods();
        g.sayHello();
        g.sayBye();
    }
}
