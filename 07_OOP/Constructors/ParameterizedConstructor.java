class ParameterizedConstructor {
    String name;
    ParameterizedConstructor(String n) {
        name = n;
    }
}
public class Main2 {
    public static void main(String[] args) {
        ParameterizedConstructor s = new ParameterizedConstructor("Mahmood");
        System.out.println(s.name);
    }
}
