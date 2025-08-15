class ObjectAsParameter {
    String name;
}
public class Main5 {
    public static void display(ObjectAsParameter p) {
        System.out.println("Name: " + p.name);
    }
    public static void main(String[] args) {
        ObjectAsParameter p = new ObjectAsParameter();
        p.name = "Mahmood";
        display(p);
    }
}
