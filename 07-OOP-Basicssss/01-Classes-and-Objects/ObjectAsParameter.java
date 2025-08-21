class Main5 {
    String name;
}
public class ObjectAsParameter {
    public static void display(Main5 p) {
        System.out.println("Name: " + p.name);
    }
    public static void main(String[] args) {
        Main5 p = new Main5();
        p.name = "Mahmood";
        display(p);
    }
}
